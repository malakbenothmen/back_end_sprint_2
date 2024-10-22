package com.malak.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.malak.users.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
