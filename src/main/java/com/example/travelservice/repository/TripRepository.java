package com.example.travelservice.repository;

import com.example.travelservice.models.Trip;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import java.util.List;

@Repository
public interface TripRepository extends MongoRepository<Trip, String> {
    List<Trip> findAllByUserEmailAndNameContainingOrderByDateFromDesc(@Param("email") String email, @Param("name") String name);
    List<Trip> findAllByOrderByDateFrom(@Param("email") String email);
}
