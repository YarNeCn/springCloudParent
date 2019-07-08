package com.example.eurekaclitwo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaclitwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaclitwoApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/hello")
    public String home(){
        return "i am port"+port;
    }
}

