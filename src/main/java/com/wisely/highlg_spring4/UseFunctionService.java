package com.wisely.highlg_spring4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {

    @Autowired
    FunctionService usefunctionservice;

    public String SayHello(String word){
        return usefunctionservice.sayHello(word);
    }
}
