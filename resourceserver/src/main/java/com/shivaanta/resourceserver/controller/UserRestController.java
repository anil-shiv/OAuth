package com.shivaanta.resourceserver.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shivaanta.resourceserver.Model.UserResponseModel;

@RestController
@RequestMapping("/api/users")
public class UserRestController {
	
	@GetMapping("/check")
	public String check() {
		return "its worrking perfectly";
	}
	
	
	//@Secured("ROLE_developer")
	//@PreAuthorize("hasRole('developer')")
	@PreAuthorize("hasAuthority('ROLE_developer') or #id == #jwt.getSubject()")
	@DeleteMapping(path = "{id}")
	public String deleteUser(@PathVariable String id,@AuthenticationPrincipal Jwt jwt) {
		return "Deleted user with id: "+id+ " and Jwt subject:- "+ jwt.getSubject();
	}
	
	@PostAuthorize("returnObject.userId == #jwt.subject")
	@GetMapping(path = "{id}")
	public UserResponseModel getUser(@PathVariable String id,@AuthenticationPrincipal Jwt jwt) {
		return new UserResponseModel("ANil", "Patel",id);
	}

}
