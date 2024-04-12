package com.myProject.GymBuddy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GymUserDto {
    private Integer id;
    private String email;
    private String name;
    private Integer age;
    private Float weight;
    private Float height;
    private String password;
}
