package com.tutiempolibro.manageshoppingcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class  ManageShoppingCartApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ManageShoppingCartApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ManageShoppingCartApplication.class);
	}
}
