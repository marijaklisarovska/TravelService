package com.example.travelservice.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Entity
@Data
@Document(collection = "gpt_responses")
public class GptResponse {
    @Id
 //   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

  //  @Column(length = 1000)
    private String prompt;

 //   @Column(length = 5000)
    private String response;

    public GptResponse() {
    }

    public GptResponse(String prompt, String response) {
        this.prompt = prompt;
        this.response = response;
    }
}
