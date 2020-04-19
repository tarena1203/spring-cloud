package com.test.testdemo;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "helloworld")
public interface HelloWorldFeignService {

    @GetMapping("/getSystemPort")
    public String getSystemPort();
}
