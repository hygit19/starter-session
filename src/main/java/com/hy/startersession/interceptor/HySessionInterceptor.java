package com.hy.startersession.interceptor;

import com.hy.startersession.config.ApplicationContextUtils;
import com.hy.startersession.config.HySessionProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class HySessionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("enter HySessionInterceptor");

        String url = request.getServletPath();

        HySessionProperties sessionProperties = (HySessionProperties) ApplicationContextUtils.getInstance(HySessionProperties.class);
        List<String> urls = sessionProperties.getExcludeUrlList();

        if(urls.contains(url)){
            System.out.println("该url不需要验证");
            return true;
        }else{
            System.out.println("验证不通过");
            return false;
        }

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
