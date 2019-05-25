package com.manan.myspring.spring3.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(MyJavaConfig2.class)
@Configuration
public class MyJavaConfig {

    @Bean // here the bean name is the method name
    public IHelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
}
