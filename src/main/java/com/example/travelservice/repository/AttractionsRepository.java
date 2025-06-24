package com.example.travelservice.repository;

import com.example.travelservice.models.Attraction;
import com.example.travelservice.models.enumerations.AttractionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.w3c.dom.Attr;

import java.util.List;
import java.util.Optional;

@Repository
public interface AttractionsRepository extends MongoRepository<Attraction, String> {
    List<Attraction> findAllByLocationContainingIgnoreCase(String location);
    List<Attraction> findAllByNameContainingIgnoreCaseAndLocationContainingIgnoreCase(String name, String location);
    List<Attraction> findAllByNameContainingIgnoreCaseAndLocationContainingIgnoreCaseAndType(String name, String location, AttractionType type);

    Optional<Attraction> findByName(String name);
}
