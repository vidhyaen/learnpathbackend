package com.josi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@CrossOrigin("localhost:3000")
@SpringBootApplication
public class Application
{

	public static void main(String[] args)
	{

		SpringApplication.run(Application.class, args);
	}
	public class WebMvcConfig implements WebMvcConfigurer{ 
		@Override
		 public void addCorsMappings(CorsRegistry registry) 
		{ registry.addMapping("/**") .allowedMethods("") .allowedOrigins("") .allowedHeaders("*") .allowCredentials(false) .maxAge(86400); } }

}
