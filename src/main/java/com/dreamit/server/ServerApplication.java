package com.dreamit.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * spring cloud eureka server注册服务端
 * @Author lvxd
 */
@EnableEurekaServer
@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {

        System.out.println("启用注册服务组件");

        SpringApplication.run(ServerApplication.class, args);
    }

}
