package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.entity.User;
import com.example.mybatisdemo.service.UseService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UseService useService;
    @RequestMapping("/findall")
    public List<User> findAll(){
        PageHelper.startPage(1, 3);
        List<User>userList= useService.findAll();
        return userList;
    }
    @RequestMapping("/insert")
    public String insertuser(String username,String password,int tid){
        useService.insertuser(username,password,tid);
        return "成功";
    }
    @RequestMapping("/update")
    public String updateuser(int id,String username,String password,String teacherid){
        useService.updateuser(id,username,password,Integer.parseInt(teacherid));
        return "成功";
    }
    @RequestMapping("/delete")
    public String deleteuser(int id){
        useService.deleteuser(id);
        return "成功";
    }

    @RequestMapping("/seleteById")
    public User seleteById(int id){
        return useService.seleteById(id);
    }
    @RequestMapping("/selectname")
    public String selectNameById(int id){
        return useService.selectNameById(id);
    }
    @RequestMapping("/ManytoOne")
    public List<User> manytoone(){
        List<User> users = useService.ManytoOne();
        for(User userlist:users){
            System.out.println(userlist.getTeacher().getTname());
        }
        System.out.println(22222);
        return users;
    }
}
