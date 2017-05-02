package com.programcreek.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programcreek.dao.UserMapper;
import com.programcreek.model.UserExample;
import com.programcreek.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	
	public Integer countUserNumberByName(String username) {
		int result = 0;
		UserExample example = new UserExample();
		example.createCriteria().andNameEqualTo(username);
		result = userMapper.countByExample(example);
		return result;
	}

}
