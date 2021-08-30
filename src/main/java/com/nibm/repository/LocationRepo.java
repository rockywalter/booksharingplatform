package com.nibm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nibm.model.Location;

@Repository
public interface LocationRepo extends JpaRepository<Location, Integer> {

}
