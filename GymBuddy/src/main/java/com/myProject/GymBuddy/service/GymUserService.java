package com.myProject.GymBuddy.service;

import com.myProject.GymBuddy.dto.GymUserDto;
import com.myProject.GymBuddy.entity.GymUser;

public interface GymUserService {
    public GymUserDto createUser(GymUserDto gymUserDto);
}
