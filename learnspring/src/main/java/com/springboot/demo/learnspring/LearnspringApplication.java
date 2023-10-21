package com.springboot.demo.learnspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LearnspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnspringApplication.class, args);
	}

//	bean for a command line runner app, the code is executed after the Spring Beans have been loaded
//	& we can use it in this method
	@Bean
	public CommandLineRunner commandLineRunner(String[] args) {
//		lambda expression syntax; think of it as JS anonymous functions
		return runner -> {
			System.out.println("Hello Mars!");
		};
	}
}
