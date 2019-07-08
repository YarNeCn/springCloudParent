package com.example.serviceribbon;

import org.springframework.stereotype.Component;

/**
 * @program: springCloudParent
 * @description:
 * @author: yarne
 * @create: 2019-07-06 15:12
 **/
@Component
public class SchedualServiceHiHystric implements HelloFeignService {
    @Override
    public String hello(String name) {
        return "hello error";
    }
}
