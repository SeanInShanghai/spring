package com.programcreek.helloworld.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloWorldController {
	String message = "Welcome to Spring MVC!";
 
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		
		return mv;
	}
	
	@RequestMapping(value = "/staticPage", method = RequestMethod.GET)
	public String redirect(){
		System.out.println("staticPage");
		return "redirect:/pages/staticPage.html";
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "index";
	}
	
	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public String redirect1(){
		return "redirect:finalPage";
	}
	
	@RequestMapping(value = "/finalPage", method = RequestMethod.GET)
	public String finalPage(){
		return "final";
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(ModelMap model){
		model.addAttribute("message"," this is message");
		return "test";
	}
}