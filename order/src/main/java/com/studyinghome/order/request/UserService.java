package com.studyinghome.order.request;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ${DESCRIPTION}
 *
 * @author Leslie
 * @email panxiang_work@163.com
 * @create 2019-04-13 22:36
 */
@FeignClient(value = "user")
public interface UserService {
    /**
     * 调用UserController的方法
     * @return
     */
    @RequestMapping(value = "/hello")
    String hello();
}
