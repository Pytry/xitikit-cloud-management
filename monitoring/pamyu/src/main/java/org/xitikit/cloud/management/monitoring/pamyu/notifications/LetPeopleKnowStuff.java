package org.xitikit.cloud.management.monitoring.pamyu.notifications;

import de.codecentric.boot.admin.notify.RemindingNotifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

/**
 * Copyright ${year}
 *
 * @author J. Keith Hoopes
 */
@Service
public class LetPeopleKnowStuff{

    @NotNull
    private final RemindingNotifier remindingNotifier;

    @Autowired
    public LetPeopleKnowStuff(@NotNull RemindingNotifier remindingNotifier){

        this.remindingNotifier = remindingNotifier;
    }

    @Scheduled(fixedRate = 60_000L)
    public void sendStuffOut(){

        remindingNotifier.sendReminders();
    }
}
