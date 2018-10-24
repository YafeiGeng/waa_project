package com.packt.webstore.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.packt.webstore.domain.User;

public interface UserService {
	
	List<User> getAllUsers();

	User getUserById(String userID);

	List<User> getProductsByCategory(String category);

	Set<User> getProductsByFilter(Map<String, List<String>> filterParams);

	void addUser(User user);

	User get(long id);

	public User getAddUser(String desc);

	List<User> getUsersByDescOrder();

	public List<User> findBySpec(User user);

}
