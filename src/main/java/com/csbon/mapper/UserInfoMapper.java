package com.csbon.mapper;

import com.csbon.model.UserInfoInsertDTO;
import com.csbon.model.UserInfoVO;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserInfoMapper {

    @Select("SELECT ID, USER_ID as userId, USER_NAME as userName FROM USER_INFO")
    List<UserInfoVO> findAll();

    @Select("SELECT ID, USER_ID as userId, USER_NAME as userName FROM USER_INFO " +
            "WHERE ID = #{id}")
    Optional<UserInfoVO> findById(final String id);

    @Insert("INSERT USER_INFO(ID, USER_ID, USER_NAME) VALUES(#{id}, #{userId}, #{userName})")
    int save(final UserInfoInsertDTO userInfoInsertDTO);

    @Update("UPDATE USER_INFO SET USER_ID = #{userId}, USER_NAME = #{userName} " +
            "WHERE ID = #{id}")
    int update(final UserInfoInsertDTO userInfoInsertDTO);

    @Delete("DELETE FROM USER_INFO WHERE ID = #{id}")
    int deleteById(final String id);

    @Delete("DELETE FROM USER_INFO")
    int deleteAll();

    int deleteFieldById(final String id);
}
