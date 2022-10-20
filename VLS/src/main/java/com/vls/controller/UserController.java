package com.vls.controller;

import com.vls.entity.UserEntity;
import com.vls.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:4200/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/select")
    public @ResponseBody Iterable<UserEntity> selectAllUsers(){
        //this returns a JSON or XML with the products
        return userService.selectAll();
    }

    @PostMapping("/login")
    public UserEntity userLogin(@RequestBody UserEntity user){
        UserEntity userEntityFromService = userService.userLogin(user);
        return userEntityFromService;
    }

    @PostMapping("/register")
    public UserEntity userRegister (@RequestBody UserEntity user){
        System.out.println("Registration:" + user);
        UserEntity userEntity = userService.userRegister(user);
        return userEntity;
    }
    @PutMapping("/update")
    public UserEntity userUpdate(@RequestBody UserEntity user){
        return userService.userUpdate(user);
    }

    public UserEntity userResetPassword(@RequestBody UserEntity user){
        UserEntity userEntityFromService = userService.resetPassword(user);
        return userEntityFromService;
    }
}
