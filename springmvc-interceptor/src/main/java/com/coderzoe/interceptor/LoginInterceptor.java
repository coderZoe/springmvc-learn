package com.coderzoe.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author yhs
 * @date 2020/7/13 19:56
 * @description
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        //判断登陆情况
        if(session.getAttribute("userInfo")!=null){ //有登录
            return true;
        }else {
            request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        }
        return false;
    }
}
