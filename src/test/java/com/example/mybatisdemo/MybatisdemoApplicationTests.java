package com.example.mybatisdemo;

import com.example.mybatisdemo.entity.User;
import com.example.mybatisdemo.service.UseService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class MybatisdemoApplicationTests {
    @Autowired
    private UseService useService;
    @DisplayName("动态查询")
    @Test
    void contextLoads() {
        Map map=new HashMap();
//        map.put("username","坤");
        map.put("password","te");
        List<User> dynaticselect = useService.dynaticselect(map);
        for(User users:dynaticselect){
            System.out.println(users.getId());
        }
    }

}
