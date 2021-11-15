package com.example.mybatisdemo.service;

import com.example.mybatisdemo.entity.Teacher;
import com.example.mybatisdemo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;
    @Override
    public List<Teacher> findall1() {
        return teacherRepository.findall1();
    }

    @Override
    public Teacher selectById(int teacherid) {
        return teacherRepository.selectById(teacherid);
    }
}
