package com.example.serice_feign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "serice_feign: 访问者:" + name + ",服务器error";
    }
}

