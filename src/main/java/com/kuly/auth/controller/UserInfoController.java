package com.kuly.auth.controller;

import com.kuly.auth.entity.UserInfo;
import com.kuly.auth.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/add")
@RequiredArgsConstructor
public class UserInfoController {

    private final UserInfoService service;

    @PostMapping
    public ResponseEntity<UserInfo> addUser(@RequestBody UserInfo userInfo){
        return ResponseEntity.ok(service.addUser(userInfo));
    }
}
