package com.coderzoe.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yhs
 * @date 2020/7/12 23:42
 * @description 本质来说，拦截器就是AOP的应用
 *              页面请求URL->拦截器判断URL是否拦截->拦截器处理->根据URL找到Servlet->Servlet处理->返回拦截器
 *              用AOP也完全可以实现，将要处理的Servlet视为切点，在切点前的操作创建before切面，在切点后的操作创建after切面
 */
public class MyInterceptor implements HandlerInterceptor {


    /**
     * @param request  请求
     * @param response 响应
     * @param handler  处理程序
     * @data: 2020/07/12 23:45
     * @author: yhs
     * @return: boolean 当return true的时候执行下一个拦截器(放行)，否则拦截请求
     * @description: 核心处理(拦截)函数
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("处理前");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("处理后");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("清理");
    }
}
