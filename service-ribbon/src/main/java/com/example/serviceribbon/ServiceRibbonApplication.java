package com.example.serviceribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient //服务提供者
@EnableDiscoveryClient //向服务中心注册，并且向程序的ioc注入一个Bean:restTempate
public class ServiceRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRibbonApplication.class, args);
    }

    @Bean   //表明这个是一个注入的bean
    @LoadBalanced  //表明这个restTemplate开启负载均衡的功能
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}

