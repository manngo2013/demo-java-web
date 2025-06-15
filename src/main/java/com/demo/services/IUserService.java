package com.demo.services;

import java.util.List;

import com.demo.entities.User;

public interface IUserService {

	public void create(User user);
	
	public List<User> findAll();
}
