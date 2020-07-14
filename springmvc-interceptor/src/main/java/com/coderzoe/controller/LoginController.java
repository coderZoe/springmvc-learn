package com.coderzoe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @author yhs
 * @date 2020/7/13 0:07
 * @description
 */
@Controller
public class LoginController {

    @PostMapping("/getLogin")
    public String getLogin(HttpSession session,String name, String password){
        session.setAttribute("userInfo",name);
        return "main";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/main")
    public String getMain(){
        return "main";
    }
}
