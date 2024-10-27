package com.example.order3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication

@EnableFeignClients(basePackages = {"com.example.order3"})
public class Order3Application {

    public static void main(String[] args) {
        SpringApplication.run(Order3Application.class, args);
    }

}
