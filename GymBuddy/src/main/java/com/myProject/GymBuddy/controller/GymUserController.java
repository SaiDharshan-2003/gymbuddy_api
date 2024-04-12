package com.myProject.GymBuddy.controller;

import com.myProject.GymBuddy.dto.GymUserDto;
import com.myProject.GymBuddy.entity.GymUser;
import com.myProject.GymBuddy.service.GymUserService;
import lombok.AllArgsConstructor;
import org.apache.catalina.mapper.Mapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@RestController
@RequestMapping("/api/gymuser")
public class GymUserController {
    private GymUserService gymUserService;
    @PostMapping
    public ResponseEntity<GymUserDto> createGymUser(@RequestBody GymUserDto gymUserDto){

        GymUserDto savedGymUser= gymUserService.createUser(gymUserDto);
        return new ResponseEntity<>(savedGymUser, HttpStatus.CREATED);
    }


}
