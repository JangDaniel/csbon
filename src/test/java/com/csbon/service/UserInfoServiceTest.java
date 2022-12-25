package com.csbon.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserInfoServiceTest {

    @Autowired
    UserInfoService userInfoService;

    @Test
    void getUserInfoTest() {
        userInfoService.getUserInfo().stream()
                .forEach(System.out::println);
    }
}