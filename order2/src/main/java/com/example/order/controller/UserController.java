package com.example.order.controller;

/**
 * @ClassName: UserController
 * @Description:
 * @Author: zhangfq
 * @CreateTime: 2024-10-07 12:42
 **/


import com.example.order.openfegin.OrderOpenFeignService;
import com.example.order.service.OrderService;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    public OrderService orderService;
    @Resource
    public OrderOpenFeignService orderOpenFeignService;
    // 1.得到日志对象
    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/sayhi")
    public String sayHi() {
// 2.使用日志打印日志
        logger.trace("================= trace ===============");
        logger.debug("================= debug ===============");
        logger.info("================= info ===============");
        logger.warn("================= warn ===============");
        logger.error("================= error ===============");
        orderService.getInfo();
        orderOpenFeignService.getInfo("");
        return "Hi," ;
    }
}
