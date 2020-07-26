package ar.edu.unaj.app.spotify.login.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unaj.app.spotify.login.entity.User;

@RestController
public class LoginController {
	
	@GetMapping
	@RequestMapping(path = "/login")
	public User login(){
		return new User(1l, "Nicolas ","Nico2154");
	}
	
	
}
