package com.mir.configclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class FirstController {
	
	@Autowired
	private RestTemplate RestTemplate;
	
	@GetMapping("/clientMsg")
	public String getMessage() {
		return "Hello from Client!";
	}
	
	@GetMapping("/serverMsg")
	public String getMessageFromServerApp() {
		String msg = RestTemplate.getForObject("http://localhost:8888/msg", String.class);
		System.out.println("Msg ==== "+msg);
		return msg;
	}

}
