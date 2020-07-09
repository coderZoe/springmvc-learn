package com.coderzoe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yhs
 * @date 2020/7/2 14:57
 * @description
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("message","hello mvc");
        return "hello";     //会被视图解析器处理 /WEB-INF/jsp/hello.jsp
    }
}
