package com.wisely.highlg_spring4;

import com.wisely.highlg_spring4.Config.*;
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

        AnnotationConfigApplicationContext context4 =
                new AnnotationConfigApplicationContext(ElConfig.class);

        ElConfig resourceService = context4.getBean(ElConfig.class);

        resourceService.outputResource();

        context4.close();


        AnnotationConfigApplicationContext context5 =
                new AnnotationConfigApplicationContext(PrePostConfig.class);

        BeanWayService beanWayService = context5.getBean(BeanWayService.class);

        JSR250Service jsr250Service = context5.getBean(JSR250Service.class);

        context5.close();

        AnnotationConfigApplicationContext context6 =
                new AnnotationConfigApplicationContext();

        context6.getEnvironment().setActiveProfiles("dev");

        context6.register(ProfileConfig.class);

        context6.refresh();

        DemoProfileService demoProfileService = context6.getBean(DemoProfileService.class);

        System.out.println(demoProfileService.getContext());

        context6.close();

        AnnotationConfigApplicationContext context7 =
                new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublisher demoPublisher = context7.getBean(DemoPublisher.class);

        demoPublisher.publish("this is publisher event");

        context7.close();

    }
}
