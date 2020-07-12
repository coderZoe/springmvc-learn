package com.coderzoe.controller;

import com.coderzoe.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yhs
 * @date 2020/7/10 20:21
 * @description
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "ok";
    }

    @PostMapping("/test2")
    public String test2(String name){
        return name;
    }

    @GetMapping("/getUser")
    public List<User> getUser(){
        List<User> userList = new ArrayList<>();
        User user = new User("殷华盛",25,"男");
        User user1 = new User("殷华盛1",26,"男");
        User user2 = new User("殷华盛2",27,"男");
        User user3 = new User("殷华盛3",28,"男");
        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        return userList;
    }


    @PostMapping("/checkName")
    public String checkName(String name){
        if("admin".equals(name)){
            return "ok";
        }else {
            return "用户名有误";
        }
    }

    @PostMapping("/checkPassword")
    public String checkPassword(String name,String password){
        if(name==null){
            return "请先输入姓名";
        }else {
            if(!"123".equals(password)){
                return "密码有误";
            }else {
                return "";
            }
        }
    }
}
