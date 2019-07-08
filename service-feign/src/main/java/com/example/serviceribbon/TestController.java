package com.example.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springCloudParent
 * @description:
 * @author: yarne
 * @create: 2019-07-06 10:28
 **/
@RestController
@RequestMapping("/feign")
public class TestController {

    @Autowired
    public HelloFeignService helloFeignService;

    @GetMapping("/hi")
    public String hello(){
        return helloFeignService.hello("taoyannan");
    }
}
