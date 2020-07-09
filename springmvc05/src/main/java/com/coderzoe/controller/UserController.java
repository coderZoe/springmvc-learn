package com.coderzoe.controller;

import com.coderzoe.entity.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yhs
 * @date 2020/7/8 21:33
 * @description
 */

@Controller
public class UserController {

//    @RequestMapping(value = "/getUser",produces = "application/json;charset=utf-8") 乱码配置
    @RequestMapping("/getUser")
    @ResponseBody
    //ResponseBody注解加上 Spring就不再会找视图解析器，而是会直接返回
    public String getUser() throws JsonProcessingException {
        User user = new User("殷华盛",25,"男");

        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(user);
    }

    @RequestMapping("/getUser2")
    @ResponseBody
    public String getUser2() throws JsonProcessingException {
        User user = new User("殷华盛",25,"男");
        User user1 = new User("殷华盛",25,"男");
        User user2 = new User("殷华盛",25,"男");
        User user3 = new User("殷华盛",25,"男");
        User user4 = new User("殷华盛",25,"男");
        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(userList);
    }
}
