package com.vls.repository;

import com.vls.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,String> {
    UserEntity findByUserIdAndUserPassword(String userId, String userPassword);
    UserEntity findByUserId(String userId);
}




