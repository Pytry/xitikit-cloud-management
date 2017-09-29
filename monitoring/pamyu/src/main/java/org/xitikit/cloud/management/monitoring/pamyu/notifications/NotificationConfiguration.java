package org.xitikit.cloud.management.monitoring.pamyu.notifications;

import de.codecentric.boot.admin.notify.Notifier;
import de.codecentric.boot.admin.notify.RemindingNotifier;
import de.codecentric.boot.admin.notify.filter.FilteringNotifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.concurrent.TimeUnit;

/**
 * Copyright ${year}
 *
 * @author J. Keith Hoopes
 */
@Configuration
@EnableScheduling
public class NotificationConfiguration{

    @Bean
    public FilteringNotifier filteringNotifier(Notifier delegate){
        return new FilteringNotifier(delegate);
    }

    @Bean
    @Primary
    @Autowired
    public RemindingNotifier remindingNotifier(Notifier notifier){

        RemindingNotifier remindingNotifier = new RemindingNotifier(notifier);
        remindingNotifier.setReminderPeriod(TimeUnit.SECONDS.toMillis(30));
        return remindingNotifier;
    }
}
