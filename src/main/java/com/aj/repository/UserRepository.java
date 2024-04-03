package com.aj.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.aj.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
