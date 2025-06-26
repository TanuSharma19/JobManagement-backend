package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.test.controller.PostController;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobManagementApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JobManagementApplication.class, args);
		PostController controller = context.getBean(PostController.class);
	
	}

}
