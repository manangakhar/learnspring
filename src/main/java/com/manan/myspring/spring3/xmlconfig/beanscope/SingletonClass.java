package com.manan.myspring.spring3.xmlconfig.beanscope;

public class SingletonClass {
    public SingletonClass() {
        System.out.println(this.getClass().getSimpleName() + " created.");
    }
}
