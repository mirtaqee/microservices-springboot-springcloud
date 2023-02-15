package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceTwoZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceTwoZuulApplication.class, args);
	}

	@GetMapping(value="/two")
	public String getMsg() {
		System.out.println("...Calling Service-2 API...");
		return "Msg from Service-TWO";
	}
	
	@GetMapping("/welcome/{name}")
	public String wish(@PathVariable String name) {
		System.out.println("...Calling Service-2 WELCOME API...");
		return "Hi "+name+", Welcome from Service TWO";
	}
}
