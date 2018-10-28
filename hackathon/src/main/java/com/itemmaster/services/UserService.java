package com.itemmaster.services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

//import org.springframework.security.core.userdetails.UserDetailsService;

import com.itemmaster.models.Users;

public interface UserService extends UserDetailsService {

	public void saveUser(Users user);

	public void updateUser(Users user);

	public Users getUser(Long userId);

	public List<Users> getAllUser();

}
