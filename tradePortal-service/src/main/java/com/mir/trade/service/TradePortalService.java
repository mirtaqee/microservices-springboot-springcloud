package com.mir.trade.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class TradePortalService {
	
	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "getForexDetailsFallback")
	public String getForexDetails() {
		String forexDetails = restTemplate.getForObject("http://localhost:8086/forex", String.class);
		return forexDetails;
	}
	
	public String getForexDetailsFallback() {
		return "********* FOREX SERVICE DOWN. Please try later ************";
	}
	

}
