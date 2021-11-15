package com.example.mybatisdemo.repository;

import com.example.mybatisdemo.entity.User;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserRepository {
    public List<User> findAll();
    public void insertuser(String username,String password,int teacherid);
    public void updateuser(int id,String username,String password,int teacherid);
    public void deleteuser(int id);
    public User seleteById(int teacherid);
    public String selectNameById(int uid);
    public List<User>ManytoOne();
    public User selectByUserid(int id);
    public List<User>dynaticselect(Map map);
}
