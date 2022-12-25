package com.csbon.controller;

import com.csbon.model.UserInfoVO;
import com.csbon.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserInfoController {
    private final UserInfoService userInfoService;

    @GetMapping("/user-info")
    public ResponseEntity<List<UserInfoVO>> getUserInfo() {
        return new ResponseEntity<>(userInfoService.getUserInfo(), HttpStatus.OK);
    }
}
