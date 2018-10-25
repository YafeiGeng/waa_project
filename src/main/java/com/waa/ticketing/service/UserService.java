package com.waa.ticketing.service;

import java.util.List;

import com.waa.ticketing.domain.User;

public interface UserService {

	List<User> getAllUsers();

	User getUserByUserName(String userID);

}
