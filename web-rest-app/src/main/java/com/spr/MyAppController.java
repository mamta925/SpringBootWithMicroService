package com.spr;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MyAppController {
	
	@RequestMapping("/welcome")
	public String invite() {
		return "Hi All";
	}
	
	@RequestMapping("/invite/{username}")
	public String invite(@PathVariable("username")String username) {
		return "welcome to <h1>"+ username+"</h1>";
	}

	@RequestMapping("/myForm")
	public ModelAndView show() {
		ModelAndView modelandView = new ModelAndView();
		modelandView.setViewName("myForm");
		return modelandView;
	}
	
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute Person t1) {
		ModelAndView modelandView = new ModelAndView();
		
		modelandView.setViewName("home");
		System.out.println(t1.getPname());
		modelandView.addObject("t1", t1);
		return modelandView;
	}
}
