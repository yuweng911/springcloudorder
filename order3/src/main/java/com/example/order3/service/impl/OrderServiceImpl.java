package com.example.order3.service.impl;

import com.example.order3.service.OrderService;
import jakarta.annotation.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: OrderServiceImpl
 * @Description:
 * @Author: zhangfq
 * @CreateTime: 2024-10-07 18:02
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    RestTemplate restTemplate;
    @Override
    public void getInfo() {

        System.out.println("111111111");
//        String url = "http://localhost:8081/user/sayhi";
//        String requestBody = "{\"key\":\"value\"}";
//
//        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody);
//        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.PUT, requestEntity, String.class);
    }
}
