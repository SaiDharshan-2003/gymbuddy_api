package com.myProject.GymBuddy.service.impl;
import com.myProject.GymBuddy.mapper.GymUserMapper;

import com.myProject.GymBuddy.dto.GymUserDto;
import com.myProject.GymBuddy.entity.GymUser;
import com.myProject.GymBuddy.repository.GymUserRepo;
import com.myProject.GymBuddy.service.GymUserService;
import org.springframework.stereotype.Service;
 @Service
public class GymUserServiceImpl implements GymUserService {
     private GymUserRepo gymUserRepo;

     private GymUserServiceImpl(GymUserRepo gymUserRepo) {
         this.gymUserRepo = gymUserRepo;
     }

     @Override
     public GymUserDto createUser(GymUserDto gymUserDto) {
         GymUser gymUser = GymUserMapper.mapToGymUser(gymUserDto);
         GymUser savedGymUser = gymUserRepo.save(gymUser);
         return GymUserMapper.mapToGymUserDto(savedGymUser);
     }
 }
