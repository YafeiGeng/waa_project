package com.packt.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packt.webstore.domain.User;
import com.packt.webstore.repository.UserRepository;
import com.packt.webstore.service.UserService;


@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {
		return userRepository.getAllUsers();
	}
/*
	@Override
	public User getUserById(String UserID) {
		return userRepository.getUserById(UserID);
	}

	@Override
	public List<User> getProductsByCategory(String category) {
		return null;
//		UserRepository.getUsersByCategory(category);
	}

	@Override
	public Set<User> getProductsByFilter(Map<String, List<String>> filterParams) {
		List<String> params = filterParams.get("brand");
		return null;
//		UserRepository.getProductsByFilter(params);
	}

	@Override
	public void addUser(User product) {
		userRepository.save(product);
	}

	@Override
	public User get(long productID) {
		return userRepository.findOne(productID);
	}

	@Override
	public List<User> getUsersByDescOrder() {
		return null;
//		UserRepository.getProductsByDescOrder();
	}

	// Cache in play because fetches are in same session
	@Override
	public User getAddUser(String desc) {
		User p = getUserById("P1235");
		p = get(p.getId());

		addUser(p);
		return p;

	}*/

}
