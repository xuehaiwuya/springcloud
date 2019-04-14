package com.studyinghome.order.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.studyinghome.order.request.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${DESCRIPTION}
 *
 * @author Leslie
 * @email panxiang_work@163.com
 * @create 2019-04-13 15:49
 */
@RestController
public class OrderController {
    @Autowired
    private UserService userService;


    /**
     * 使用注解形式的hystrix
     * //@HystrixCommand(fallbackMethod = "error")
     */
    @RequestMapping(value = "/order")
    public String hello() {
        return userService.hello();
    }

    private String error() {
        return "REQUEST ERROR";
    }

}
