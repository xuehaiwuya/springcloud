package com.studyinghome.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaApplication
 *
 * @author Leslie
 * <p>
 * 关闭security验证
 * @SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
 * </p>
 * @email panxiang_work@163.com
 * @create 2019/4/13 11:11
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

}
