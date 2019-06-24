package com.wisely.highlg_spring4.Config;

import com.wisely.highlg_spring4.BeanWayService;
import com.wisely.highlg_spring4.JSR250Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.wisely.highlg_spring4.Config")
public class PrePostConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    JSR250Service jsr250Service(){
        return new JSR250Service();
    }
}
