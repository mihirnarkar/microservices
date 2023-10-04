package com.mindcraft.accountservicedemo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.net.MediaType;

@RestController
@RequestMapping("/api/account")
public class MyAccountController {
	
//	Fake balance for random mapping
	@GetMapping(path = "/balance", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public Map<String, Double> fetchbalance() {
		Map<String, Double> map = new HashMap<>();
		map.put("balance",Double.valueOf(Math.random() * 12345));
		return map;
	}
	
}
