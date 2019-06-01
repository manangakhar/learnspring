package com.manan.myspring.spring3.javaconfig.componentscan;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component(value = "mySingletonJavaBean")
public class SingletonJavaClass {
    public SingletonJavaClass() {
        System.out.println(this.getClass() + " created.");
    }
}
