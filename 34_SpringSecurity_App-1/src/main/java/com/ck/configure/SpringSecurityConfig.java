package com.ck.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.bind.annotation.GetMapping;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig {


    @Bean
    public SecurityFilterChain SecurityFileter(HttpSecurity http) throws Exception{ 
		
		http.authorizeHttpRequests((req) -> 
				req.requestMatchers("/logincheck", "/contact")
				.permitAll()
				.anyRequest()
				.authenticated()
			)
			.formLogin(Customizer.withDefaults());
		
		return http.build();
	}
   
}
