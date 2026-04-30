package com.ck.filter;

import java.io.IOException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.filter.OncePerRequestFilter;

public class StudentFilter extends OncePerRequestFilter {
	    @Override
	    protected void doFilterInternal(HttpServletRequest request,
	                                    HttpServletResponse response,
	                                    FilterChain filterChain)
	            throws ServletException, IOException {

	        	System.out.println("1. Entering student filter");

	        	filterChain.doFilter(request, response);

	        	System.out.println("3. Exiting student filter");

	    }

	}


