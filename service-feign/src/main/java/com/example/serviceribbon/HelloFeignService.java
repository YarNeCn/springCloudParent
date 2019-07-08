package com.example.serviceribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Method;

/**
 * @program: springCloudParent
 * @description:
 * @author: yarne
 * @create: 2019-07-06 10:22
 **/
@FeignClient(value = "server-cli",fallback = SchedualServiceHiHystric.class)
public interface HelloFeignService {

    @GetMapping(value = "/hello")
     String hello(@RequestParam(value = "name",defaultValue = "tyn") String name);

}
