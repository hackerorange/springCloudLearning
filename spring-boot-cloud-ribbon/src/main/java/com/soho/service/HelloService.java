package com.soho.service;

import com.soho.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URLEncoder;

@Service
public class HelloService {

    private final RestTemplate restTemplate;

    @Autowired
    public HelloService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String hiService(Student student) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        try {
            headers.add("real", URLEncoder.encode("我的","UTF-8"));
            headers.add("real", URLEncoder.encode("我的001","UTF-8"));
            HttpEntity<Student> entity = new HttpEntity<>(student, headers);
            restTemplate.setErrorHandler(new ResponseErrorHandler() {
                @Override
                public boolean hasError(ClientHttpResponse response) throws IOException {
                    return false;
                }

                @Override
                public void handleError(ClientHttpResponse response) throws IOException {
                    System.out.println(response.getStatusCode());
                    System.out.println(response.getStatusText());
                }
            });
            return restTemplate.postForObject("http://HELLO/hello", entity, String.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "发生异常";
    }

}