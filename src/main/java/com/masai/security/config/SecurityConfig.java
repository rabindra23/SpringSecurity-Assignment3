package com.masai.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	
	@Bean
	protected SecurityFilterChain mySecurityConfig(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests((auth)->auth
				.requestMatchers("/customer/{email}","/customer/all").authenticated()
				.requestMatchers("/customer/register").permitAll()
		).csrf().disable().httpBasic();
		return http.build();	
	}
}
