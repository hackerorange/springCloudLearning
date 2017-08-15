package com.soho.controller;

import com.soho.model.Student;
import com.soho.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    private final HelloService hello;

    @Autowired
    public HelloController(HelloService hello) {
        this.hello = hello;
    }


    @RequestMapping(value = "/hi")
    public String hi() {
        Student student=new Student();
        student.setAge("12");
        student.setName("张三");
        return hello.hiService(student);
    }

}