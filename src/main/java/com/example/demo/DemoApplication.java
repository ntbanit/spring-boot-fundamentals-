package com.example.demo;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponse;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
    public OncePerRequestFilter trailingSlashFilter() {
        return new OncePerRequestFilter() {
            @Override
            protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
                    throws ServletException, IOException {
                String uri = request.getRequestURI();
                if (uri.endsWith("/") && !uri.equals("/")) {
                    // Remove trailing slash, preserving query string
                    String newUri = uri.substring(0, uri.length() - 1);
                    // Wrap request to modify URI
                    HttpServletRequest wrappedRequest = new HttpServletRequestWrapper(request) {
                        @Override
                        public String getRequestURI() {
                            return newUri;
                        }

                        @Override
                        public StringBuffer getRequestURL() {
                            StringBuffer url = new StringBuffer();
                            url.append(request.getScheme()).append("://")
                               .append(request.getServerName())
                               .append(request.getServerPort() == 80 || request.getServerPort() == 443 ? "" : ":" + request.getServerPort())
                               .append(newUri);
                            return url;
                        }

                        @Override
                        public String getServletPath() {
                            return newUri;
                        }
                    };
                    filterChain.doFilter(wrappedRequest, response);
                } else {
                    filterChain.doFilter(request, response);
                }
            }
        };
    }
}
