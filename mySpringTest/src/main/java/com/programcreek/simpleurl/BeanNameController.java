package com.programcreek.simpleurl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class BeanNameController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("ok");
		ModelAndView model = new ModelAndView("beanName");
		model.addObject("message", "bean name handling");
		return model;
	}

}
