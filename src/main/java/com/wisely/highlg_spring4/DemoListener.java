package com.wisely.highlg_spring4;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEventService> {

    public void onApplicationEvent(DemoEventService demoEventService){

        String msg = demoEventService.getMsg();

        System.out.println("DemoListener 收到 bean-publisher訊息"+msg);
    }
}
