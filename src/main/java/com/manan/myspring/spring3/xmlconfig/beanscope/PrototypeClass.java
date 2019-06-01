package com.manan.myspring.spring3.xmlconfig.beanscope;

public class PrototypeClass {
    public PrototypeClass() {
        System.out.println(this.getClass().getSimpleName() + " created.");
    }
}
