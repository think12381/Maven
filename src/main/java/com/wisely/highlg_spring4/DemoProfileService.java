package com.wisely.highlg_spring4;

public class DemoProfileService {
    private String context;

    public DemoProfileService(String context){
        super();
        this.context = context;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
