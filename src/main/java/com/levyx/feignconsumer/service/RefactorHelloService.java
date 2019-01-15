package com.levyx.feignconsumer.service;

import com.levyx.helloservice.service.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("HeLLO-SERVICE")
public interface RefactorHelloService extends HelloService{

}
