package com.apigtw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class GatewayController {
	
	@GetMapping("/movie")
	public String productServiceFallback() {
		return "This is a fallback for movie service. Service down.";
	}

	@GetMapping("/user")
	public String userServiceFallback() {
		return "This is a fallback for user service. Service down.";
	}
}
