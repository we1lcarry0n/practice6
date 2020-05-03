package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@SpringBootApplication
public class App {

	private static UserService userService;
	public static void main(String[] args) {
		UserService userService = applicationContext.getBean(UserService.class);
		UserEntity user = userService.createUser("firstName1", "lastName1", "email1@example.com");
		System.out.println("Saved new user: " + user);

	}

}
