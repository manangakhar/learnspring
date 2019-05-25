package com.manan.myspring.spring3.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldApplication {
    public static void main(String[] args) {
        ApplicationContext contextFromAnnotation = new AnnotationConfigApplicationContext(MyJavaConfig.class);
        final IHelloWorld helloWorld = (IHelloWorld) contextFromAnnotation.getBean("helloWorld");
        helloWorld.sayHello();
    }
}
