package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceOneZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceOneZuulApplication.class, args);
	}
	
	@GetMapping(value="/one")
	public String getMsg() {
		System.out.println("...Calling Service-1 API...");
		return "Msg from ServiceOne";
	}

}
