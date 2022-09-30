package com.robert.routesspringdemo.controllers;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		int testint = 3;
		String var = "Bobby brown";
		model.addAttribute("name", var);
		model.addAttribute("number", testint);
		return "index.jsp";
	}
	
	@GetMapping("/jstl")
	public String jstl(Model model) {
		Date d = new Date();
		String name = "Bobby brown";
		Integer age = 53;
		Boolean isHungry = true;
		model.addAttribute("dateFromJsp", d);
		model.addAttribute("jspName", name);
		model.addAttribute("jspAge", age);
		model.addAttribute("jspIsHungry", isHungry);
		model.addAttribute("test", "<script>alert('h1')</script>");
		
        ArrayList<String> users = new ArrayList<String>();
        users.add("Bobby Brown");
        users.add("Jimmy Bean");
        users.add("Martha Smith");
        users.add("Alex Miller");
        
        for(String u: users) {
            System.out.println(u);
        }

        
        model.addAttribute("jspUsers", users);
		
		return "jstl.jsp";
	}
}
