package org.xitikit.cloud.management.monitoring.pamyu;

import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.ListConfig;
import com.hazelcast.config.MapConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright ${year}
 *
 * @author J. Keith Hoopes
 */
@Configuration
public class ClusteringConfiguration{

    @Bean
    public Config hazelcastConfig(){

        return new Config().setProperty("hazelcast.jmx", "true")
            .addMapConfig(new MapConfig("spring-boot-admin-application-store").setBackupCount(1)
                .setEvictionPolicy(EvictionPolicy.NONE))
            .addListConfig(new ListConfig("spring-boot-admin-event-store").setBackupCount(1)
                .setMaxSize(1000));
    }
}
