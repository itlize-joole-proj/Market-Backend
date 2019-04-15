package com.itlize.marketBackend.dao;

import com.itlize.marketBackend.model.User;

public interface UserDAO {
	User addUser(User user);
	User getUser(String username);
	boolean isUserExist(String username);
}
