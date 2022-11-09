package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerProjectApplication {

	@GetMapping("/hello")
	public String getHelloWorld()
	{
		return "Hello World";
	}
	public static void main(String[] args) {
		SpringApplication.run(DockerProjectApplication.class, args);
	}

}
