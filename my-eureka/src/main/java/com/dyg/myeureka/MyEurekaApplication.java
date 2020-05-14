package com.dyg.myeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * @author Duan Yigui
 * @date 2020/05/09
 * eureka服务启动类
 */
@SpringBootApplication
@EnableEurekaServer
public class MyEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyEurekaApplication.class, args);
    }

}
