package com.manan.myspring.spring3.javaconfig.componentscan;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope(value = "prototype")
@Service(value = "myPrototypeJavaBean")
public class PrototypeJavaClass {
    public PrototypeJavaClass() {
        System.out.println(this.getClass() + " created.");
    }
}
