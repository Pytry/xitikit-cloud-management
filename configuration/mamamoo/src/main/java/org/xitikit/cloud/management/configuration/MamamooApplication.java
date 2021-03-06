package org.xitikit.cloud.management.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Copyright ${year}
 *
 * @author J. Keith Hoopes
 */
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class MamamooApplication{

    public static void main(String[] args){

        SpringApplication.run(MamamooApplication.class, args);
    }
}
