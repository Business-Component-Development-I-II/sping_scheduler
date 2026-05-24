package edu.icet.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReportScheduler {

    @Scheduled(cron = "* * * * * *")
    void sendSms(){
        //DB call to grt Customer List
        //Extract Mobile Numbers
        //SMS message
        System.out.println("SMS sent");
    }
}
