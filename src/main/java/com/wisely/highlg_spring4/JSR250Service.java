package com.wisely.highlg_spring4;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250Service {
    @PostConstruct
    public void init(){
        System.out.println("jsr 250 init");
    }

    public JSR250Service(){
        super();
        System.out.println("jsr 250 constructor");
    }

    @PreDestroy
    public void destroy(){
        System.out.println(" jsr 250 destory");
    }

}
