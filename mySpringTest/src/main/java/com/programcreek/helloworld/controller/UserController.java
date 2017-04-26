package com.programcreek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.programcreek.dao.UserMapper;
import com.programcreek.model.UserExample;

@Controller
public class UserController {

	UserMapper userMapper;
	@RequestMapping("getTotalNumber")
	public ModelAndView getNumber(){
		ModelAndView model = new ModelAndView("userController");
		UserExample example = new UserExample();
		userMapper.countByExample(example);
		model.addObject("number", 0);
		return model;
	}
}
