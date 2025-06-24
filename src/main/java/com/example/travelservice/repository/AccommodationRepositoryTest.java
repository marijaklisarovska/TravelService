package com.example.travelservice.repository;

import com.example.travelservice.models.Accommodation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataMongoTest
public class AccommodationRepositoryTest {

    @Autowired
    private AccommodationRepository accommodationRepository;

    @Test
    public void testSaveAndFind() {
        Accommodation acc = new Accommodation("Test Hotel", "Test City", 4.5, 120.0, 2, null);

        accommodationRepository.save(acc);

        List<Accommodation> found = accommodationRepository.findAll();

        assertThat(found).isNotEmpty();
        assertThat(found.get(0).getName()).isEqualTo("Test Hotel");
    }
}
