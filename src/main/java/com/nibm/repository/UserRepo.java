package com.nibm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nibm.model.User;

import antlr.collections.List;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	User findByEmail(String email);

}
