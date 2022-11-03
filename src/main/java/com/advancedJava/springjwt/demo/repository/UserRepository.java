package com.advancedJava.springjwt.demo.repository;

import com.advancedJava.springjwt.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends  JpaRepository<User, Integer> {

    public User findByUsername(String username) ;
}
