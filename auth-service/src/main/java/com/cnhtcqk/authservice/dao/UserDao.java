package com.cnhtcqk.authservice.dao;

import com.cnhtcqk.authservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {

    User findByUsername(String username);
}
