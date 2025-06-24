package com.example.travelservice.repository;

import com.example.travelservice.models.Attraction;
import com.example.travelservice.models.enumerations.AttractionType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataMongoTest
public class AttractionRepositoryTest {

    @Autowired
    private AttractionsRepository attractionRepository;

    @Test
    public void testSaveAndFind() {
        Attraction attraction = new Attraction(
                "Test Museum",
                "A great place to learn history",
                "Test City",
                15.0,
                AttractionType.MUSEUM
        );

        attractionRepository.save(attraction);

        List<Attraction> found = attractionRepository.findAll();

        assertThat(found).isNotEmpty();
        assertThat(found.get(0).getName()).isEqualTo("Test Museum");
    }
}
