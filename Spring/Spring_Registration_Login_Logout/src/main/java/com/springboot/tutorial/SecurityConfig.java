package com.springboot.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Bean
    public UserDetailsService userDetailsService() {
        return new MyUserDetailsService();
    }
	
	@Bean
	public AuthenticationProvider authProvider()
	{
	
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService());
		provider.setPasswordEncoder(new BCryptPasswordEncoder());
		
		return provider;
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
        .antMatchers("/users").authenticated()
        .anyRequest().permitAll()
        .and()
        .formLogin()
            .usernameParameter("email")
            .defaultSuccessUrl("/users")
            .permitAll()
        .and()
        .logout().logoutSuccessUrl("/").permitAll();
		
			
	}
	
}
