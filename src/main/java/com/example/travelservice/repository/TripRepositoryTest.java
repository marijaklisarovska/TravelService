package com.example.travelservice.repository;

import com.example.travelservice.models.Trip;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataMongoTest
public class TripRepositoryTest {

    @Autowired
    private TripRepository tripRepository;

    @Test
    void saveAndFindTrip() {
        // given
        Trip trip = new Trip();
        trip.setName("Test Trip");
        trip.setBudget(500.0);
        trip.setNumPeople(2);
        trip.setDateFrom(LocalDateTime.now());
        trip.setDateTo(LocalDateTime.now().plusDays(3));

        // when
        tripRepository.save(trip);
        List<Trip> trips = tripRepository.findAll();

        // then
        assertThat(trips).isNotEmpty();
        assertThat(trips.get(0).getName()).isEqualTo("Test Trip");
    }
}
