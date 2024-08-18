package com.conferencemanagementsystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conferencemanagementsystem.model.User;
import com.conferencemanagementsystem.repository.UserRepository;
import com.conferencemanagementsystem.service.UserService;

@Service
public class UserImpl implements UserService {
	
	@Autowired
    private UserRepository userRepository;
	
	public UserImpl(UserRepository userRepo) {
		super();
		this.userRepository=userRepo;
	}


	@Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

	
    @Override
    public User updateUser(User user, Long id) {
        User existingUser = getUserById(id);
        if (existingUser!= null) {
            existingUser.setName(user.getName());
            existingUser.setEmail(user.getEmail());
            existingUser.setPassword(user.getPassword());
            existingUser.setCompany(user.getCompany());
            existingUser.setRole(user.getRole());
            return userRepository.save(existingUser);
        } else {
            return null;
        }
    }

}



	

