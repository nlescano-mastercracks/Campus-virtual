package ar.edu.unaj.app.spotify.login.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@GetMapping
	@RequestMapping(path = "/login")
	public String login(){
		return "general/login";
	}
}
