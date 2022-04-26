package com.demo.jpa.example1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.jpa.example1.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
