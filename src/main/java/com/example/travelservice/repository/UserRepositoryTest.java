package com.example.travelservice.repository;

import com.example.travelservice.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataMongoTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSaveAndFind() {
        User user = new User("Mongo User", "mongouser@example.com", "securepassword");

        userRepository.save(user);

        List<User> found = userRepository.findAll();

        assertThat(found).isNotEmpty();
        assertThat(found.get(0).getEmail()).isEqualTo("mongouser@example.com");
        assertThat(found.get(0).getFullName()).isEqualTo("Mongo User");
    }
}
