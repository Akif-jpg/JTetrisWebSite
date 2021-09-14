package com.programming.JavaTetrisWeb;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {
	

	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
	    // TODO Auto-generated method stub
	    	http.csrf().disable().authorizeRequests()
	    	.antMatchers("/**").permitAll();
	    }

}
