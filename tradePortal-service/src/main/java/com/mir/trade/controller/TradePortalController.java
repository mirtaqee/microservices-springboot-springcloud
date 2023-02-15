package com.mir.trade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mir.trade.service.TradePortalService;

@RestController
public class TradePortalController {
	
	@Autowired
	private TradePortalService tradePortalService;

	@GetMapping(value = "/trade")
	public String getInfo() {
		return "Hi - This message is from Trade Service";
	}

	@GetMapping(value = "/trade-forex")
	public String getForexDetails() {
		return tradePortalService.getForexDetails();
	}

}
