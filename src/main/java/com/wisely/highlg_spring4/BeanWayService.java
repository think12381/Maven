package com.wisely.highlg_spring4;

public class BeanWayService {

    public void init(){
        System.out.println("@bean init method");
    }

    public BeanWayService(){
        super();
        System.out.println("Bean BeanWayService constructor");
    }

    public void destroy(){
        System.out.println(" @bean destroy");
    }
}
