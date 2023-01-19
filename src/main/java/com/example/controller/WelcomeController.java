package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.Student;

@Controller
public class WelcomeController {
	@RequestMapping("/welcome")
	public ModelAndView wish1()
	{
		ModelAndView x = new ModelAndView("WelcomePage");
		x.addObject("msg", "Welcome");
		return x;
		
	}
	
	@RequestMapping(value = "/welcome/{name}")
	public ModelAndView wish2(@PathVariable("name") String name)
	{
		ModelAndView x = new ModelAndView("WelcomePage");
		x.addObject("msg", "Welcome " + name);
		return x;
	}
	
	@GetMapping("/welcomeDataForm")
	public ModelAndView wish3()
	{
		ModelAndView x = new ModelAndView("WelcomeData");
		return x;
	}
	
	@PostMapping("/register")
	public ModelAndView wish4(@RequestParam("name") String n)
	{
		Student s= new Student();
		s.setName(n);
		ModelAndView x = new ModelAndView("Success");
		x.addObject("stu",s);
		return x;
	}
}
