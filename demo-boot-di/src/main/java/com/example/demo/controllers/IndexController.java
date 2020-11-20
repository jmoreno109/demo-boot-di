package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.User;
import com.example.demo.service.IAnimalService;

@Controller
public class IndexController {

	@Autowired
	IAnimalService service;
	
	@Autowired
	User user;

	@GetMapping("/index")
	public String index(Model model) {
		
		System.out.println(user);
		
		model.addAttribute("response", service.operation());
		model.addAttribute("user", user);
		return "index";
	}

}
