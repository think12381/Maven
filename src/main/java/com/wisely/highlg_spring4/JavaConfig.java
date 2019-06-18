package com.wisely.highlg_spring4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public FunctionService1 functionService1(){
        return new FunctionService1();
    }

    @Bean
    public UseFunctonService1 useFunctonService1(){

        UseFunctonService1 useFunctonService1 = new UseFunctonService1();
        useFunctonService1.setFunctionService1(functionService1());

        return useFunctonService1;
    }
}
