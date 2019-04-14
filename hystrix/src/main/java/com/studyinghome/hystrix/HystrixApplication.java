package com.studyinghome.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
/**
 * HystrixApplication
 *
 * @author Leslie
 * @email  panxiang_work@163.com
 * @create 2019/4/14 14:56
 */
@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
@EnableDiscoveryClient
public class HystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class, args);
    }

}
