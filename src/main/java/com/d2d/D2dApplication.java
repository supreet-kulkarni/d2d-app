package com.d2d;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class D2dApplication {

	public static void main(String[] args) {
		SpringApplication.run(D2dApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfig() {
	    return new WebMvcConfigurer() {
	        @Override
	        public void addCorsMappings(CorsRegistry registry) {
	            registry.addMapping("/**")
	                    .allowedOrigins("http://localhost:4200")
	                    .allowedMethods(HttpMethod.GET.name(),
	                            HttpMethod.POST.name(),
	                            HttpMethod.DELETE.name())
	                    .allowedHeaders(HttpHeaders.CONTENT_TYPE,
	                            HttpHeaders.AUTHORIZATION);
	        }
	    };
	}

}
