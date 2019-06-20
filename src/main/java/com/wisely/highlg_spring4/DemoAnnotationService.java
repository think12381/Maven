package com.wisely.highlg_spring4;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {

    @Action(name = "add operation")
    public void add(){}
}
