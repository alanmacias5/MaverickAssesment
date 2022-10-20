package com.vls.service;

import com.vls.entity.UserEntity;
import com.vls.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Iterable<UserEntity> selectAll() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity userLogin(UserEntity user) {
        UserEntity userEntityFromDb = userRepository.getById(user.getUserId());
        if(user.getUserId().equals(userEntityFromDb.getUserId()) && user.getUserPassword().equals(userEntityFromDb.getUserPassword())){
            return userEntityFromDb;
        }
        return user;
    }

    @Override
    public UserEntity userRegister(UserEntity user) {

        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(user.getUserPassword().getBytes());
            byte[] resultByteArray = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : resultByteArray) {
                sb.append(String.format("%02x", b));
            }
            String hashedPassword = sb.toString();
            user.setUserPassword(hashedPassword);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("No Such Algorithm...");
        }

        UserEntity savedUserEntity = userRepository.save(user);
        return savedUserEntity;
    }

    @Override
    public UserEntity findByUserIdAndUserPassword(String userId, String userPassword) {
        return userRepository.findByUserIdAndUserPassword(userId,userPassword);
    }

    @Override
    public UserEntity findByUserId(String userId) {
        return userRepository.findByUserId(userId);
    }

    @Override
    public Boolean isValidUser(String userId, String userPassword) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(userPassword.getBytes());
            byte[] resultByteArray = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : resultByteArray) {
                sb.append(String.format("%02x", b));
            }
            String hashedPassword = sb.toString();
            UserEntity user = findByUserIdAndUserPassword(userId, hashedPassword);

            if (user != null)
                return true;
            else
                return false;
        } catch (NoSuchAlgorithmException e) {
            System.out.println("No Such Algorithm...");
        }
        return false;
    }

    @Override
    public UserEntity userUpdate(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public UserEntity resetPassword(UserEntity user) {
        UserEntity userEntityFromDb = userRepository.getById(user.getUserId());
        if(user.getUserId().equals(userEntityFromDb.getUserId()) && user.getUserPassword().equals(userEntityFromDb.getUserPassword())){
            userEntityFromDb.setUserPassword("");
            return userEntityFromDb;
        }
        return user;
    }

}