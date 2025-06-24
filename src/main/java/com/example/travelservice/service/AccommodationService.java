package com.example.travelservice.service;

import com.example.travelservice.models.Accommodation;
import com.example.travelservice.models.dto.AccommodationDto;
import com.example.travelservice.models.enumerations.AccommodationType;

import java.util.List;
import java.util.Optional;

public interface AccommodationService {
    List<Accommodation> listAllAccommodations();
    Optional<Accommodation> findById(String id);
    Optional<Accommodation> create(AccommodationDto accommodationDto);
    Optional<Accommodation> update(String id, AccommodationDto accommodationDto);
    void deleteById(String id);
    List<Accommodation> search(String name, String location, AccommodationType type);
    List<Accommodation> findByAccommodationTypeBasedOnTheLocation(String location, AccommodationType accommodationType );
    List<Accommodation> findAccommodationsByPriceLessThan(Double pricePerNight, Double rating);

    List<Accommodation> findByNameAndLocation(String name, String location);
    List<Accommodation> findAllByOrderByRatingDesc();
}
