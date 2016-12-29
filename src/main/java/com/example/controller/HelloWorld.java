package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorld {

	@GetMapping("/")
	public String helloWorld(Model model) {
		model.addAttribute("hello", "i am from Controller");
		return "hello";  // return hello jsp
	}

}
