package com.Maket.Market.web.security;

import com.Maket.Market.domain.service.UserService;
import com.Maket.Market.web.security.firlter.JwtFilterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig /*extends WebSecurityConfigurerAdapter */{
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private JwtFilterRequest jwtFilterRequest;
    
    /*    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(userService);
    }
    */
    
    void registerProvider(AuthenticationManagerBuilder auth){
        auth.authenticationProvider((AuthenticationProvider) userService);
                
    }
    

    /*    @Override
    protected void configure(HttpSecurity http) throws Exception {
    //http.csrf().disable().authorizeRequests().antMatchers("/**///authenticate").permitAll()
   //         .anyRequest().authenticated().and().sessionManagement()
      //              .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    //        http.addFilterBefore(jwtFilterRequest, UsernamePasswordAuthenticationFilter.class);
  //}

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
     
        
       http.csrf().disable()
            .authorizeRequests().antMatchers("/**/authenticate").permitAll()
            .anyRequest().authenticated().and().sessionManagement()
            
                    .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
            http.addFilterBefore(jwtFilterRequest, UsernamePasswordAuthenticationFilter.class);
        
        return http.build();
    }
    /*    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
    return super.authenticationManagerBean();
    }*/
    
    @Bean
    AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
    return authenticationConfiguration.getAuthenticationManager();
    }
    
    
   
}
