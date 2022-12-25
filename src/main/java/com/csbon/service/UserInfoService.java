package com.csbon.service;

import com.csbon.mapper.UserInfoMapper;
import com.csbon.model.UserInfoVO;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UserInfoService {
    private final UserInfoMapper userInfoMapper;

    @Transactional(readOnly = true)
    @Cacheable("user-info")
    public List<UserInfoVO> getUserInfo() {
        return userInfoMapper.findAll();
    }
}
