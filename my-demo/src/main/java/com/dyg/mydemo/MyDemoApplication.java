package com.dyg.mydemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Duan Yigui
 * @date 2020/05/09
 * 项目启动类
 */
@SpringBootApplication(scanBasePackages = {"com.dyg.mydemo"})
@EnableEurekaClient
public class MyDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyDemoApplication.class, args);
    }

}
