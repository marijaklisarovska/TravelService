package com.example.travelservice.models;
//import jakarta.persistence.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;
import jakarta.validation.constraints.Min;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

@Data
//@Entity
@Document(collection = "trips")
public class Trip {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    String name;
    @Min(value = 0, message = "Budget cannot be a negative number")
    Double budget;
    @Min(value = 0, message = "Number of people cannot be a negative number")
    Integer numPeople;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDateTime dateFrom;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDateTime dateTo;
 //   @ManyToMany(fetch = FetchType.EAGER)
    @DBRef
    List<Attraction> attractions;
 //   @ManyToMany(fetch = FetchType.EAGER)
    @DBRef
    List<Accommodation> accommodations;
 //   @ManyToOne
    @DBRef
    User user;

    public Trip() {
    }


    public Trip(String name, Double budget, Integer numPeople, LocalDateTime date_from, LocalDateTime date_to, List<Attraction> attractions, List<Accommodation> accommodations, User user) {
        this.name = name;
        this.budget = budget;
        this.numPeople = numPeople;
        this.dateFrom = date_from;
        this.dateTo = date_to;
        this.attractions = attractions;
        this.accommodations = accommodations;
        this.user = user;
    }
}
