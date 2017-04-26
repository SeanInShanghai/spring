package com.programcreek.helloworld.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class UserControllerTest extends MultiActionController {
	
	public ModelAndView home(HttpServletRequest request, HttpServletResponse response){
		ModelAndView model = new ModelAndView("user");
		model.addObject("message", "home 方法");
		return model;
	}
	
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
		ModelAndView model = new ModelAndView("user");
		model.addObject("message", "add 方法");
		return model;
	}
	
	public ModelAndView remove(HttpServletRequest request, HttpServletResponse response){
		ModelAndView model = new ModelAndView("user");
		model.addObject("message", "remove 方法");
		return model;
	}
	
	public ModelAndView main(HttpServletRequest request, HttpServletResponse response){
		ModelAndView model = new ModelAndView("user");
		model.addObject("message", "main 方法");
		return model;
	}
}
