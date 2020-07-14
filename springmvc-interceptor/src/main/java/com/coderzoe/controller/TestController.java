package com.coderzoe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yhs
 * @date 2020/7/12 23:39
 * @description
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "ok";
    }
}
