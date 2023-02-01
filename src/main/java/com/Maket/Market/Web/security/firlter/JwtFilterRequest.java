
package com.Maket.Market.web.security.firlter;

import com.Maket.Market.domain.service.UserService;
import com.Maket.Market.web.security.JWTUtil;
import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class JwtFilterRequest extends OncePerRequestFilter{
    
    @Autowired
    private JWTUtil jwtUtil;
    
    @Autowired
    private UserService userDetails;
    
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
      String authorizationHeader = request.getHeader("Authorization");
      if(authorizationHeader != null &&authorizationHeader.startsWith("Bearer")){
          String jwt = authorizationHeader.substring(7);
          String username = jwtUtil.ExtractUsername(jwt);
          
          if(username != null && SecurityContextHolder.getContext().getAuthentication() == null){
              UserDetails userDetails = this.userDetails.loadUserByUsername(username);
              if(jwtUtil.ValidateToken(jwt, userDetails)){
                  UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                  authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                  
                  SecurityContextHolder.getContext().setAuthentication(authToken);
              }
          }                 
      }
      filterChain.doFilter(request, response);
    }
    
}
