package com.example.Profile.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table
@RequiredArgsConstructor
@Data
public class User {

    private  Long id;

    private String name;

    private String lastName;

    private String login;

    private String password;

    private Integer salary;

    private Integer salaryPerDay;

    private LocalDateTime date;


}
