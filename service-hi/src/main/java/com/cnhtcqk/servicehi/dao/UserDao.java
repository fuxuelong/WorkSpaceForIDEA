package com.cnhtcqk.servicehi.dao;

import com.cnhtcqk.servicehi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {

}
