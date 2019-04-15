package com.itlize.marketBackend.service;

import com.itlize.marketBackend.model.User;

public interface UserService {
	User getUser(String username);
	User addUser(User user);
	boolean isUserExist(String username);
}
