package com.example.travelservice.repository;

import com.example.travelservice.models.GptResponse;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GptResponseRepository extends MongoRepository<GptResponse, String> {
}
