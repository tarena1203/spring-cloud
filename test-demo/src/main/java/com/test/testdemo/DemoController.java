package com.test.testdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private HelloWorldFeignService helloWorldFeignService;

    @GetMapping("/test")
    public String test(){
        String port = helloWorldFeignService.getSystemPort();
        return port;

    }
}
