package com.example.service_ribbon.controller;

import com.example.service_ribbon.seervice.TemplateService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@RestController
public class TemplateControler {

    @Resource
    TemplateService helloService;

    /**
     * 这里访问eureka_client里面的接口
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }


}

