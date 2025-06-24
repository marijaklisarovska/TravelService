package com.example.travelservice.models;

import com.example.travelservice.models.enumerations.AttractionType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
//@Entity
@Document(collection = "attractions")
public class Attraction {
    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    String Id;
    String name;
    String description;
    String location;
    Double price;

    AttractionType type;

    public Attraction() {
    }

    public Attraction(String name, String description, String location, Double price, AttractionType type) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.price = price;
        this.type = type;
    }
}
