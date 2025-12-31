package com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.MyUser;

public interface UserRepo extends JpaRepository<MyUser, String>{

}
