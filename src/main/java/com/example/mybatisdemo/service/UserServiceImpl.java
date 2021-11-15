package com.example.mybatisdemo.service;

import com.example.mybatisdemo.entity.User;
import com.example.mybatisdemo.repository.UserRepository;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UseService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void insertuser(String username,String password,int teacherid) {
        userRepository.insertuser(username,password,teacherid);
    }

    @Override
    public void updateuser(int id,String username,String password,int teacherid) {
        userRepository.updateuser(id,username,password,teacherid);
    }

    @Override
    public void deleteuser(int id) {
        userRepository.deleteuser(id);
    }

    @Override
    public User seleteById(int teacherid) {
        return userRepository.seleteById(teacherid);
    }

    @Override
    public String selectNameById(int uid) {
        return userRepository.selectNameById(uid);
    }

    @Override
    public List<User> ManytoOne() {
        return userRepository.ManytoOne();
    }

    @Override
    public User selectByUserid(int id) {
        return userRepository.selectByUserid(id);
    }

    @Override
    public List<User> dynaticselect(Map map) {
        return userRepository.dynaticselect(map);
    }


}
