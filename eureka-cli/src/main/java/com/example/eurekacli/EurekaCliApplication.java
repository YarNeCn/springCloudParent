package com.example.eurekacli;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@SpringBootApplication
@EnableEurekaClient //声明这个工程是eureka服务提供者
@RestController
public class EurekaCliApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCliApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String home(@RequestParam(value = "name",defaultValue = "tyn") String name){
            return "hello " +name+ ",i ame from port:"+port;
    }
}

