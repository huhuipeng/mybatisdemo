package com.example.mybatisdemo.entity;

import lombok.Data;

@Data
public class User {
    private int id;
    private String username;
    private String password;
    private int teacherid;
    private  Teacher teacher;
}
