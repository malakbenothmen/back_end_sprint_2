package com.malak.users.service;

import com.malak.users.entities.Role;
import com.malak.users.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);

}
