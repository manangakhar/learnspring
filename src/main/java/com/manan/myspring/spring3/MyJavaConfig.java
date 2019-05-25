package com.manan.myspring.spring3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyJavaConfig {
    
    @Bean
    public IHelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
}
