package com.fa.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test() {
        User user = new User();
        user.setEmail("djd342@naver.com");
        user.setName("jaemin");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        User user1 = new User("ss", "ss2",  LocalDateTime.now(), LocalDateTime.now());
        User user2 = new User("ss", "ss2");

        User user3 = User.builder()
                .email("ss")
                .name("ss")
                .build();

        System.out.println("user = " + user.toString());
    }
}