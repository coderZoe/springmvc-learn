package com.coderzoe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author yhs
 * @date 2020/7/7 21:45
 * @description
 */
@Controller
public class ServletTest {

    /**
     * @param request  请求
     * @param response 响应
     * @data: 2020/07/07 21:46
     * @author: yhs
     * @return:
     * @description: 不难看出来 本质还是一个Servlet 可以直接拿来用request和response
     */
    @RequestMapping("/servlet")
    public void test(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        System.out.println(session.getId());

        request.setAttribute("message","hello");

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/hello.jsp");
        requestDispatcher.forward(request,response);
    }
}
