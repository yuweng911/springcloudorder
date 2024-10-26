package com.example.eurka1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurkaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurkaServiceApplication.class, args);
    }

}
