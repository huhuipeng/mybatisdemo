package com.example.mybatisdemo.entity;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private int teacherid;
    private String tname;
    private String course;
    private List<User> userList;
}
