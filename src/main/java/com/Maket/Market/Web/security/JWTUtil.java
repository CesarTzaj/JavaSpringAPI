package com.Maket.Market.web.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Calendar;
import java.util.Date;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class JWTUtil {
    
    private static final String Key = "Cesar";
    Calendar calendar;
    
    public String GenerateToken(UserDetails userDetails){
    return Jwts.builder().setSubject(userDetails.getUsername()).setIssuedAt(new Date())
            .setExpiration(new Date((long) (System.currentTimeMillis() +1000 * 60 * 60 *0.5)))
            .signWith(SignatureAlgorithm.HS512, Key).compact();
    }
    
    public boolean ValidateToken(String token, UserDetails userDetails){
    return userDetails.getUsername().equals(ExtractUsername(token)) && !isTokeExpired(token);
    }
    
    public String ExtractUsername(String token){
    return getClaims(token).getSubject();
    }
    
    public boolean isTokeExpired(String token){
        return getClaims(token).getExpiration().before(new Date());
    }
    
    private Claims getClaims(String token){
        //return Jwts.parser().setSigningKey(Key).parseClaimsJws(token).getBody();
        return (Claims) Jwts.parserBuilder().setSigningKey(Key).build().parseClaimsJws(token);
    }
}
