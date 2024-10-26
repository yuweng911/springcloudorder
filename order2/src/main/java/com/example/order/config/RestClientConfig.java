package com.example.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: RestClientConfig
 * @Description:
 * @Author: zhangfq
 * @CreateTime: 2024-10-07 18:51
 **/
@Configuration
public class RestClientConfig {



    // 或者自定义请求工厂
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setReadTimeout(5000); // 设置读取超时时间
        factory.setConnectTimeout(5000); // 设置连接超时时间
        return new RestTemplate(factory);
    }
}

