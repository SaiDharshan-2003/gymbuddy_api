package com.myProject.GymBuddy.mapper;

import com.myProject.GymBuddy.dto.GymUserDto;
import com.myProject.GymBuddy.entity.GymUser;

public class GymUserMapper {
    public static GymUserDto mapToGymUserDto(GymUser gymUser){
        return new GymUserDto(
                gymUser.getId(),
                gymUser.getEmail(),
                gymUser.getName(),
                gymUser.getAge(),
                gymUser.getWeight(),
                gymUser.getWeight(),
                gymUser.getPassword()
        );
    }
    public static GymUser mapToGymUser(GymUserDto gymUserDto){
        return new GymUser(
                gymUserDto.getId(),
                gymUserDto.getEmail(),
                gymUserDto.getName(),
                gymUserDto.getAge(),
                gymUserDto.getWeight(),
                gymUserDto.getWeight(),
                gymUserDto.getPassword()
        );
    }
}
