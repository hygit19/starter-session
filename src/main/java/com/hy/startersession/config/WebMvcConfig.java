package com.hy.startersession.config;

import com.hy.startersession.interceptor.HySessionInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.out.println("WebMvcConfig");
        registry.addInterceptor(new HySessionInterceptor());
    }
}
