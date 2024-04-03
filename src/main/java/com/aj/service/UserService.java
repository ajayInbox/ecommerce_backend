package com.aj.service;

import com.aj.exception.UserException;
import com.aj.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;

}
