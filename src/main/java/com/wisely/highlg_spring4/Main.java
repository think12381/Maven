package com.wisely.highlg_spring4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Diconfig.class);

        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);

        System.out.println(useFunctionService.SayHello("di12345"));

        context.close();


        AnnotationConfigApplicationContext context1 =
                new AnnotationConfigApplicationContext(JavaConfig.class);

        UseFunctonService1 useFunctionService1 = context1.getBean(UseFunctonService1.class);

        System.out.println(useFunctionService1.sayHello("JAVA CONFIG"));

        context.close();

    }
}
