package com.conferencemanagementsystem.service;

import java.util.List;

import com.conferencemanagementsystem.model.User;

public interface UserService {
	User saveUser(User user);
	List<User> getAllUsers();
	User getUserById(Long id);
	void deleteUser(Long id);
	User updateUser(User user, Long id);

}
