package com.dev2.example;


	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.context.annotation.Configuration;

	/* @SpringBootApplication consists of @Configuration, @ComponentScan and @EnableAutoConfiguration.
	 * This annotation enable component scan and auto configuration. */

	@SpringBootApplication

	/*
	@Configuration
	@ComponentScan(basePackages = {"com.dev2qa.example"})
	@EnableAutoConfiguration
	*/
	public class SpringBootWebApplication {



	    public static void main(String[] args) {
	      /* Responsible for launching the boot application. */
	        SpringApplication.run(SpringBootWebApplication.class, args);
	    }
	}


