package com.soho;

import model.PageResponse;
import model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhongchongtao
 */
@EnableEurekaClient
@SpringBootApplication
@RestController
public class SohoEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SohoEurekaClientApplication.class, args);
    }

    @RequestMapping("hello")
    public PageResponse<Student> hello(String name, @RequestHeader(required = false) String[] real) {
        Student student = new Student("张三", 12);
        PageResponse<Student> pageResponse = new PageResponse<>();
        pageResponse.setData(student);
        return pageResponse;
    }

}
