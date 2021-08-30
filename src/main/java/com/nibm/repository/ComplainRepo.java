package com.nibm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nibm.model.Complain;

@Repository
public interface ComplainRepo extends JpaRepository<Complain, Integer> {

}
