package com.myProject.GymBuddy.repository;

import com.myProject.GymBuddy.entity.GymUser;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface GymUserRepo extends JpaRepository<GymUser, Integer> {
}
