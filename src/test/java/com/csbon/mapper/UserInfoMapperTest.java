package com.csbon.mapper;

import com.csbon.model.UserInfoInsertDTO;
import com.csbon.model.UserInfoVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserInfoMapperTest {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Test
    void findAllTest() {
        userInfoMapper.findAll().stream().forEach(System.out::println);
    }

    @Test
    void findByIdTest() {
        assertEquals(userInfoMapper.findById("5f96ab84-b6f6-4e7b-ab77-a34f1ec896ef")
                .orElseGet(UserInfoVO::new).getUserId(), "caaabbb");

    }

    @Test
    void saveTest() {
        UserInfoInsertDTO userInfoInsertDTO = new UserInfoInsertDTO();
        userInfoInsertDTO.setId(UUID.randomUUID().toString());
        userInfoInsertDTO.setUserId("csbon1");
        userInfoInsertDTO.setUserName("장석봉");

        assertEquals(userInfoMapper.save(userInfoInsertDTO), 1);
    }

    @Test
    void updateTest() {
        UserInfoInsertDTO userInfoInsertDTO = new UserInfoInsertDTO();
        userInfoInsertDTO.setId("5f96ab84-b6f6-4e7b-ab77-a34f1ec896ef");
        userInfoInsertDTO.setUserId("caaabbb");
        userInfoInsertDTO.setUserName("장석봉11");

        assertEquals(userInfoMapper.update(userInfoInsertDTO), 1);
    }

    @Test
    void deleteByIdTest() {
        assertEquals(userInfoMapper.deleteById("20221225151100000"), 1);
    }

    @Test
    void deleteFieldByIdTest() {
        assertEquals(userInfoMapper.deleteFieldById("5f96ab84-b6f6-4e7b-ab77-a34f1ec896ef"), 1);
    }
}