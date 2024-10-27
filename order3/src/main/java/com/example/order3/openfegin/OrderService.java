package com.example.order3.openfegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: OrderService
 * @Description:
 * @Author: zhangfq
 * @CreateTime: 2024-10-27 14:46
 **/
@FeignClient(value="order2", path="/usr")
public interface OrderService {
        //这里注解里参数，要和远程服务的一致
        @GetMapping("/sayHello")
        String sayHello(@RequestParam("name")String name);



}
