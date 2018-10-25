package com.waa.ticketing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.waa.ticketing.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>, JpaSpecificationExecutor<User> {

	// findAll comes with repository
	@Query("SELECT u FROM USER u")
	public List<User> getAllUsers();
/*
	@Query("SELECT u FROM USER u WHERE USERID = :userId")
	User getUserById(@Param("userId") String key);*/

}
