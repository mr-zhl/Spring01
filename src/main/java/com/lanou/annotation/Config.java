package com.lanou.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//配置类
@ComponentScan("com.lanou.*")
@Configuration
public class Config {
    @Bean
    public Computer getComputer(){
       return new Computer();
    }

}
