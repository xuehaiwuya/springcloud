package com.studyinghome.user.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${DESCRIPTION}
 *
 * @author Leslie
 * @email panxiang_work@163.com
 * @create 2019-04-13 15:40
 */
@RestController
public class UserController {

    @RequestMapping("/hello")
    @HystrixCommand(fallbackMethod = "error")
    public String hello() {
        return "hello world!";
    }

    public String error() {
        return "UserService error";
    }
}
