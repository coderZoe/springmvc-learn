package com.coderzoe.controller;

import com.coderzoe.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yhs
 * @date 2020/7/7 22:12
 * @description
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/test1")

    public String test1(Model model,String name){
        //当Http请求的参数名与这里写的变量名一样时(http://localhost:8080/springmvc04/user/test1?name=yhs),直接写变量名即可。
        //当不一样时，需要加个转化(http://localhost:8080/springmvc04/user/test1?username=yhs)
        //public String test1(Model model,@RequestParam("username") String name)
        model.addAttribute("message",name);
        return "hello";
    }

    @GetMapping("/test2")
    public String test2(Model model, User user){
        //传递的是对象 当传递参数与对象数据域名称一样时可以用
        //http://localhost:8080/springmvc04/user/test2?name=yhs&age=15&id=3
        System.out.println(user);
        model.addAttribute("user",user);
        return "hello";
    }

    /**
     * @param model 模型
     * @param name  的名字
     * @data: 2020/07/07 22:56
     * @author: yhs
     * @return: {@link String }
     * @description: 测试乱码
     */
    @PostMapping("/test3")
    public String test3(Model model,String name){
        model.addAttribute("message",name);
        return "hello";
    }
}
