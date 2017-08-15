package com.soho.config.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @author Zhongchongtao
 */
public class TestInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        try {
            requestTemplate.header(
                    "real",
                    URLEncoder.encode("真实地址", "UTF-8"),
                    URLEncoder.encode("我的地址", "UTF-8")
            );
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
