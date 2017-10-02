package org.xitikit.cloud.management.monitoring.pamyu;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright ${year}
 *
 * @author J. Keith Hoopes
 */
@Configuration
@EnableAdminServer
@EnableDiscoveryClient
@EnableAutoConfiguration
public class PamyuApplication extends SpringBootServletInitializer{

    public static void main(final String[] args){

        SpringApplication.run(PamyuApplication.class, args);
    }
}
