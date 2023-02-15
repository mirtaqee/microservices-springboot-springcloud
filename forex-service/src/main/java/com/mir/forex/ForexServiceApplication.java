package com.mir.forex;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ForexServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForexServiceApplication.class, args);
	}
	
	@GetMapping(value="/forex")
	public String getForexDetails() {
		Map<String, Integer> forexMap = new HashMap<>();
		forexMap.put("USD", 80);
		forexMap.put("AUD", 50);
		forexMap.put("GBP", 100);
		return forexMap.toString();
	}

}
