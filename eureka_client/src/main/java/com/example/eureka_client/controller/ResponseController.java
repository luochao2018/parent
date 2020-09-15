package com.example.eureka_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {
    @Value("${server.port}")
    String port;

    @RequestMapping("hi")
    @ResponseBody
    public String home(@RequestParam String name) {
        return "当前服务器端口号:" + port + ",  访问者姓名:" + name;
    }
}
