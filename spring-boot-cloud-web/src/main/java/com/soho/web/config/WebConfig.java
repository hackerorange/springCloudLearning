package com.soho.web.config;

import com.soho.web.config.interceptor.WebLastInterceptor;
import com.soho.web.config.interceptor.WebLogInterceptor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Zhongchongtao
 */
@Configuration
@EnableAutoConfiguration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new WebLogInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(new WebLastInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
