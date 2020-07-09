package com.coderzoe.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yhs
 * @date 2020/7/2 15:40
 * @description 控制器
 *              通过@Controller注解 类中所有的方法，如果返回值为String，并且有具体页面，那么就会被视图解析器解析
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")

    public String hello(Model model){
        model.addAttribute("message","hello SpringMvc");
        return "hello";
    }
}
