package com.programcreek.helloworld.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class UserAction implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response){
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("message", "增加了一个用户");
		modelAndView.setViewName("success");
		
		return modelAndView;
	}
}
