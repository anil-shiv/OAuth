package com.shivaanta.resourceserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserRestController {
	
	@GetMapping("/check")
	public String check() {
		return "its worrking perfectly";
	}

}
