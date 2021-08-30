package com.nibm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nibm.model.RequestedBook;

@Repository
public interface RequestedBookRepo extends JpaRepository<RequestedBook, Integer>{

}
