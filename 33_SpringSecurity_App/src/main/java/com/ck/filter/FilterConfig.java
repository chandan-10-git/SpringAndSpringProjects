package com.ck.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<StudentFilter> studentFilterRegistration() {
        FilterRegistrationBean<StudentFilter> registrationBean = 
        								new FilterRegistrationBean<>();

        registrationBean.setFilter(new StudentFilter());
        registrationBean.addUrlPatterns("/student/*");
        return registrationBean;
    }

  
    @Bean
    public FilterRegistrationBean<TrainerFilter> userFilterRegistration() {
        FilterRegistrationBean<TrainerFilter> registrationBean = 
        								new FilterRegistrationBean<>();

        registrationBean.setFilter(new TrainerFilter());
        registrationBean.addUrlPatterns("/trainer/*");
        return registrationBean;

    }

}