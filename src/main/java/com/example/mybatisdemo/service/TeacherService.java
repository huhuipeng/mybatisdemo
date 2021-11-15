package com.example.mybatisdemo.service;

import com.example.mybatisdemo.entity.Teacher;

import java.util.List;

public interface TeacherService {
    public List<Teacher>findall1();
    public Teacher selectById(int teacherid);
}
