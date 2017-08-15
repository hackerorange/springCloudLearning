package com.soho.service.impl;

import com.soho.response.BodyResponse;
import com.soho.response.Student;
import com.soho.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author Zhongchongtao
 */
@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public BodyResponse<Student> hiService(String name, Integer age) {
        System.out.println("发生异常，无法执行");
        return null;
    }
}
