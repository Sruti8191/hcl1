package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringDemo1Application extends SpringBootServletInitializer {

	@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

	return application.sources(SpringDemo1Application.class);
}
	public static void main(String[] args) {
		SpringApplication.run(SpringDemo1Application.class, args);
	}

}
