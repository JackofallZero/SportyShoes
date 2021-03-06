package com.spring.boot.ss.services;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.ss.models.*;
import com.spring.boot.ss.repo.UserRepository;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userrepository;

	@Override
	public User saveDepartment(User user) {
		
		return userrepository.save(user);
	}

	@Override
	public List<User> fetchDepartmentList() {
		// TODO Auto-generated method stub
		return (List<User>)userrepository.findAll();
	}

	@Override
	public User updateDepartment(User user, Integer UserID) {
		User userdb = userrepository.findById(UserID).get();
		if (Objects.nonNull(user.getUsername())
	            && !"".equalsIgnoreCase(
	            		user.getUsername())) {
	           	user.setUsername(
	            		user.getUsername());
	        }
		if (Objects.nonNull(user.getPassword())
	            && !"".equals(
	            		user.getPassword())) {
	           	user.setPassword(user.getPassword());
	        }
	  
		
	        return userrepository.save(user);
	        
	}

	@Override
	public void deleteUserById(Integer UserId) {
		
		userrepository.deleteById(UserId);
		
	}

}
