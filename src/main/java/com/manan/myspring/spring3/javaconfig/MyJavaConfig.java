package com.manan.myspring.spring3.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyJavaConfig {

    @Bean // here the bean name is the method name
    public IHelloWorld helloWorld() {
        return new HelloWorldImpl();
    }

    @Bean(name = "helloBean") // can give multiple names too. giving name does not allow to get bean by method name
    public IHelloWorld helloWorldBean() {
        return new HelloWorldImpl();
    }
}
