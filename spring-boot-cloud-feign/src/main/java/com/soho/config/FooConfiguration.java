package com.soho.config;

import com.soho.config.interceptor.TestInterceptor;
import feign.Contract;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConfiguration {
//    @Bean
//    public Contract feignContractg() {
//        return new feign.Contract.Default();
//    }

//    @Bean
//    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
//        return new BasicAuthRequestInterceptor("user", "password");
//    }

    @Bean
    public TestInterceptor testInterceptor() {
        return new TestInterceptor();
    }
}