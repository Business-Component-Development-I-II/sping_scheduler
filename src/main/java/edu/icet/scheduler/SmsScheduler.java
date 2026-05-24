package edu.icet.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SmsScheduler {

    @Scheduled(fixedRate = 5000)
    void sendSms(){
        System.out.println("SMS sent");
    }
}
