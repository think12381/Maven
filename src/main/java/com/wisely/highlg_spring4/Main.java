package com.wisely.highlg_spring4;

import com.wisely.highlg_spring4.Config.AopConfig;
import com.wisely.highlg_spring4.Config.Diconfig;
import com.wisely.highlg_spring4.Config.JavaConfig;
import com.wisely.highlg_spring4.Config.ScopeConfig;
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

        context1.close();


        AnnotationConfigApplicationContext context2 =
                new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService demoAnnotationService = context2.getBean(DemoAnnotationService.class);

        DemoMethodService demoMethodService = context2.getBean(DemoMethodService.class);

        demoAnnotationService.add();

        demoMethodService.add();

        context2.close();


        AnnotationConfigApplicationContext context3 =
                new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService demoSingletonService = context3.getBean(DemoSingletonService.class);
        DemoSingletonService demoSingletonService1 = context3.getBean(DemoSingletonService.class);

        DemoPrototypeService demoPrototypeService = context3.getBean(DemoPrototypeService.class);
        DemoPrototypeService demoPrototypeService1 = context3.getBean(DemoPrototypeService.class);

        System.out.println("Sigleton equal?" + demoSingletonService.equals(demoSingletonService1));

        System.out.println("Prototye equal?" + demoPrototypeService.equals(demoPrototypeService1));
        context3.close();


    }
}
