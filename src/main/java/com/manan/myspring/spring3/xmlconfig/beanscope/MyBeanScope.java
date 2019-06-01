package com.manan.myspring.spring3.xmlconfig.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBeanScope {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansResource2.xml");
        // prints created only once (same initialization/class per getBean)
        SingletonClass singletonClassClass1 = (SingletonClass) context.getBean("mySingletonBean");
        SingletonClass singletonClassClass2 = (SingletonClass) context.getBean("mySingletonBean");
        // prints created twice (both initializations are independent of each other)
        PrototypeClass prototypeClass1 = (PrototypeClass) context.getBean("myPrototypeBean");
        PrototypeClass prototypeClass2 = (PrototypeClass) context.getBean("myPrototypeBean");
    }
}
