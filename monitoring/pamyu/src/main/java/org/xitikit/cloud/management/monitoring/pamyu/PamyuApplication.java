package org.xitikit.cloud.management.monitoring.pamyu;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * Copyright ${year}
 *
 * @author J. Keith Hoopes
 */
@RefreshScope
@EnableAdminServer
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
@EnableConfigurationProperties
public class PamyuApplication{

    public static void main(final String[] args){

        SpringApplication.run(PamyuApplication.class, args);
    }
}
