package com.fa.jpa.bookmanager.repository;

import com.fa.jpa.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() {
        userRepository.save(new User("david", "david@fastcampus.com"));

        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user.setEmail("martin-update@fastcampus.com");

        userRepository.save(user);
    }

    @Test
    void select() {
        System.out.println(userRepository.findByName("martin"));

        System.out.println("userRepository.findUserByEmail(\"2\") = " + userRepository.findUserByEmail("2"));
        System.out.println("userRepository.getByEmail(\"e\") = " + userRepository.getByEmail("e"));
        System.out.println("userRepository.readByEmail(\"2\") = " + userRepository.readByEmail("2"));
        System.out.println("userRepository.queryByEmail(\"s\") = " + userRepository.queryByEmail("s"));
        System.out.println("userRepository.searchByEmail(\"s\") = " + userRepository.searchByEmail("s"));
        System.out.println("userRepository.streamByEmail(\"2\") = " + userRepository.streamByEmail("2"));
        System.out.println("userRepository.findUserByEmail(\"ss\") = " + userRepository.findUserByEmail("ss"));
    }
}