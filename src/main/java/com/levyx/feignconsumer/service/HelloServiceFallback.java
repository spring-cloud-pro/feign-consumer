package com.levyx.feignconsumer.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceFallback implements HelloService {


    @Override
    public String ho() {
        return "error";
    }

    @Override
    public String hello(String name) {
        return "error";
    }

    @Override
    public com.levyx.feignconsumer.model.User hello(String name, Integer age) {
        return new com.levyx.feignconsumer.model.User("未知",0);
    }

    @Override
    public String hello(com.levyx.feignconsumer.model.User user) {
        return "error";
    }
}
