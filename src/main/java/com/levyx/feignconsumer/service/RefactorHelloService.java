package com.levyx.feignconsumer.service;

import com.levyx.helloservice.service.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "HELLO-SERVICE")
public interface RefactorHelloService extends HelloService{

}
