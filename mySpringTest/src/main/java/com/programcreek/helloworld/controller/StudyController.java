package com.programcreek.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.programcreek.bean.HelloWorld;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Controller
public class StudyController {
	static Log log = LogFactory.getLog(StudyController.class.getName());
	
	@SuppressWarnings("resource")
	@RequestMapping(value = "/helloworld", method = RequestMethod.GET)
	public String printHelloWorld(ModelMap model){
		String result = "hello world";
		log.info("my log out file");

		
//		ApplicationContext context = new ClassPathXmlApplicationContext("helloworld");
//		HelloWorld hw = (HelloWorld)context.getBean("helloworld");
//		
//		log.info("bean file" + hw.getMessage());
//		
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "hello";
	}
	
	
}
