package com.coderzoe.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yhs
 * @date 2020/6/28 21:13
 * @description
 */
public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");  //  /WEB-INF/jsp/hello.jsp
        modelAndView.addObject("message","HelloSpringMVC");
        return modelAndView;
    }
}
