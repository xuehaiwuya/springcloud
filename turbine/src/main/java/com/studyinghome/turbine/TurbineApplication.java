package com.studyinghome.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
/**
 * TurbineApplication
 * 
 * @author Leslie
 * @email  panxiang_work@163.com
 * @create 2019/4/14 22:07
 */
@SpringBootApplication
@EnableTurbine
public class TurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurbineApplication.class, args);
    }

}
