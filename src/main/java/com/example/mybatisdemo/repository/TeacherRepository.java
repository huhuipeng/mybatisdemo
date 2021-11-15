package com.example.mybatisdemo.repository;

import com.example.mybatisdemo.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TeacherRepository {
    public List<Teacher>findall1();
    public Teacher selectById(int teacherid);
}
