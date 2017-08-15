package com.soho.service;

import com.soho.config.FooConfiguration;
import com.soho.response.BodyResponse;
import com.soho.response.Student;
import com.soho.service.impl.HelloServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = HelloService.SERVICE_NAME, configuration = FooConfiguration.class,
        fallback = HelloServiceImpl.class)
public interface HelloService {

    String SERVICE_NAME = "HELLO";

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public BodyResponse<Student> hiService(@RequestParam("name") String name, @RequestHeader("age") Integer age);


}