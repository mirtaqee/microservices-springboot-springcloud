package com.mir.configclient;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigClientController {
	
	@Value("{driverClassName}")
	String driverClassName;
	@Value("{url}")
	String url;
	@Value("{userName}")
	String userName;
	@Value("{Password}")
	String Password;
	
	@GetMapping(value="/database")
	public String getDBProperties() {
		System.out.println("################### "+driverClassName);
		Map<String, String> map = new HashMap<>();
		map.put("driverClassName", driverClassName);
		map.put("url", url);
		map.put("userName", userName);
		map.put("password", Password);
		return map.toString();
		
	}

}
