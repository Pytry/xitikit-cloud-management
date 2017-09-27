package org.xitikit.cloud.management.proxy.zuul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class SimpleZuulProxyApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SimpleZuulProxyApplication.class).run(args);
    }
}
