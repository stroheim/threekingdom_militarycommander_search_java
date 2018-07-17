package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("greeting")
public class GreetingController {
	
	@RequestMapping("/hello")
	public String hello(
			@RequestParam(value="name",required=false,defaultValue="the world!") String name,
			Model model
			) {
		model.addAttribute("name", name);
		return "greeting";
	}

}
