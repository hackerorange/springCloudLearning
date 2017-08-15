package com.soho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Zhongchongtao
 */
@EnableEurekaServer
@SpringBootApplication
public class SohoEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SohoEurekaServerApplication.class, args);
    }
}
