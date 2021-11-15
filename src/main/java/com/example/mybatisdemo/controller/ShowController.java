package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.entity.User;
import com.example.mybatisdemo.service.UseService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ShowController {
    @Autowired
    private UseService useService;
    @RequestMapping("/showlist")
    public String show(Map<String, Object> map, @RequestParam(required = false, defaultValue = "1", value = "p") Integer pageNum,
                       @RequestParam(defaultValue = "4", value = "ps") Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<User> alluser = useService.findAll();
        PageInfo<User> page = new PageInfo<User>(alluser, pageSize);

        map.put("alluser",page);
        return "show";
    }
    @RequestMapping("/adduser")
    public String adduser(String username,String password,String teacherid){
        useService.insertuser(username,password,Integer.parseInt(teacherid));

        return "redirect:/showlist";
    }
    @RequestMapping("/updateuser")
    public String updateuser(String id, String username, String password, String teacherid){
        useService.updateuser(Integer.parseInt(id),username,password,Integer.parseInt(teacherid));

        return "redirect:/showlist";
    }
    @RequestMapping("/deleteuser")
    public String deleteuser(@RequestParam("id")Integer id){
        useService.deleteuser(id);
        return "redirect:/showlist";
    }
    @ResponseBody
    @RequestMapping("/selectbyid")
    public User selectByUserid(@RequestParam("id")Integer id){
        User user = useService.selectByUserid(id);
        return user;
    }

    @RequestMapping("/showlist2")
    public String showselect(Map<String, Object> map, @RequestParam(required = false, defaultValue = "1", value = "p") Integer pageNum,
                       @RequestParam(defaultValue = "5", value = "ps") Integer pageSize,String username,String password){
        PageHelper.startPage(pageNum, pageSize);
        Map map1=new HashMap();
        map1.put("username",username);
        map1.put("password",password);
        List<User> alluser = useService.dynaticselect(map1);
        PageInfo<User> page = new PageInfo<User>(alluser, pageSize);

        map.put("alluser",page);
        return "show";
    }
}
