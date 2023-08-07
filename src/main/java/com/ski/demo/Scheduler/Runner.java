package com.ski.demo.Scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Runner {

  private static final Logger LOG = LoggerFactory.getLogger(Runner.class);
    
  //in this example, that we’re scheduling a task to be executed at 10:15 AM on the 15th day of every month.
  //@Scheduled(cron = "0 0 2 7 * ?")
  @Scheduled(cron = "0 */2 * * * *")
  //@Scheduled(cron = "${scheduling.job.cron}")
  public void create() {
    long yourmilliseconds = System.currentTimeMillis();
    SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm");    
    Date resultdate = new Date(yourmilliseconds);
    System.out.println("current epoch : " + sdf.format(resultdate));
  }
}
