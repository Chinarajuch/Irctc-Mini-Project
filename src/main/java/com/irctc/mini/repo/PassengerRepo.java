package com.irctc.mini.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.irctc.mini.entities.Passenger;

@Repository
public interface PassengerRepo extends JpaRepository<Passenger,Integer>{

}
