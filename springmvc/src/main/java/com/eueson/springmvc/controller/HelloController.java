package com.eueson.springmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /**
     * SpringBoot 项目既不需要部署到 tomcat, 也不需要 web.xml 和 Spring 相关的 xml 配置文件
     * SpringBoot 的自动配置是如何实现的呐？
     * */
    @RequestMapping("/hello")
    public String hanlder01() {
        return "Hello, Spring Boot 2!";
    }
}
