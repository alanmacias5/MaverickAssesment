package com.vls.service;

import com.vls.entity.UserEntity;

public interface UserService {

    Iterable<UserEntity> selectAll();
    UserEntity userLogin(UserEntity user);
    UserEntity userRegister(UserEntity user);
    UserEntity findByUserIdAndUserPassword(String userId, String userPassword);
    UserEntity findByUserId(String userId);
    Boolean isValidUser(String userId, String userPassword);
    UserEntity userUpdate (UserEntity user);

    UserEntity resetPassword (UserEntity user);
}