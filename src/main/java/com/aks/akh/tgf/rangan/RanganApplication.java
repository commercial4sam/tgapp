package com.aks.akh.tgf.rangan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.aks.akh")
public class RanganApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(RanganApplication.class, args);
	}

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(RanganApplication.class);
    }
	
}
