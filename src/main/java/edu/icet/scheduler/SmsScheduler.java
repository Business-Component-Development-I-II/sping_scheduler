package edu.icet.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SmsScheduler {

    private static final Logger log = LoggerFactory.getLogger(SmsScheduler.class);

    @Scheduled(cron = "* * * * * *")
    void sendSms(){
        //DB call to grt Customer List
        //Extract Mobile Numbers
        //SMS message
        //System.out.println("SMS sent");
        log.info("SMS Sent");
    }
}
