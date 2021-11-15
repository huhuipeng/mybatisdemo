package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.entity.Teacher;
import com.example.mybatisdemo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @RequestMapping("/findall1")
    public List<Teacher>findAll(){
        return teacherService.findall1();
    }
    @RequestMapping("/selectById")
    public Teacher selectbyid(int tid){
        return teacherService.selectById(tid);
    }
}
