/*package com.java.loan.configuration.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@Configuration
@EnableWebMvcSecurity
public class SSConfiguration extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		 http.authorizeRequests()
	        .antMatchers("/", "/home").access("hasRole('ROLE_USER')")
	        .antMatchers("/register").permitAll()
	        .antMatchers("/teacher/**").access("hasRole('ROLE_USER')")
	        .and().formLogin().loginPage("/login")
	        //.successHandler(customUrlSuccess)
	        .usernameParameter("username").passwordParameter("password")        
	        .and().csrf()
	        .and().exceptionHandling().accessDeniedPage("/Access_Denied")
	        .and().exceptionHandling().accessDeniedPage("/403")
	        .and()
			  	  .sessionManagement()
			  	  .sessionAuthenticationErrorUrl("/login")
			  	  .sessionFixation()
			  	  .changeSessionId()
			  	  .maximumSessions(10)
			  	  .maxSessionsPreventsLogin(true);
			  	  //.expiredUrl("/login/maxSessions")
			  	  //.sessionRegistry(sessionRegistryImpl()); // when login it create one session already;
	}

}
*/