package com.example.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType.HAL;

@RestController
@EnableHystrix
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
@EnableHypermediaSupport(type = HAL)
public class AaaApplication{

    public static void main(String[] args){

        SpringApplication.run(AaaApplication.class, args);
    }

    @RequestMapping("/hi")
    public String hi(){

        return "{hi:\"hi\"}";
    }
}
