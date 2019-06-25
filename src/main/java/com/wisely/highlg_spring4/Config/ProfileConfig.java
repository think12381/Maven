package com.wisely.highlg_spring4.Config;

import com.wisely.highlg_spring4.DemoProfileService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public DemoProfileService demoDevProfileService(){
        return new DemoProfileService("from Dev");
    }

    @Bean
    @Profile("prod")
    public DemoProfileService demoProdProfileService(){
        return new DemoProfileService("from prod");
    }
}
