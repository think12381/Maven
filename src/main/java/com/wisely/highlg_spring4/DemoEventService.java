package com.wisely.highlg_spring4;

import org.springframework.context.ApplicationEvent;

public class DemoEventService extends ApplicationEvent {
    private static final long servialVersionUID = 1L;
    private String msg;

    public DemoEventService(Object source,String msg){

        super(source);
        this.msg = msg;
    }

    public String getMsg(){
        return msg;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }
}
