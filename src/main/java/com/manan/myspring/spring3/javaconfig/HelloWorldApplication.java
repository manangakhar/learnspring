package com.manan.myspring.spring3.javaconfig;

import com.manan.myspring.spring3.javaconfig.componentscan.PrototypeJavaClass;
import com.manan.myspring.spring3.javaconfig.componentscan.SingletonJavaClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldApplication {
    public static void main(String[] args) {
        ApplicationContext contextFromAnnotation = new AnnotationConfigApplicationContext(MyJavaConfig.class);
        final IHelloWorld helloWorld = (IHelloWorld) contextFromAnnotation.getBean("helloWorld");
        helloWorld.sayHello();

        final IHelloWorld helloWorld2 = (IHelloWorld) contextFromAnnotation.getBean("helloBean");
        helloWorld2.sayHello();

        ApplicationContext contextFromComponentScanResource = new ClassPathXmlApplicationContext("SpringBeansResource2.xml");
        // prints created only once (same initialization/class per getBean)
        SingletonJavaClass singletonJavaClass1 = (SingletonJavaClass) contextFromComponentScanResource.getBean("mySingletonJavaBean");
        SingletonJavaClass singletonJavaClass2 = (SingletonJavaClass) contextFromComponentScanResource.getBean("mySingletonJavaBean");
        // prints created twice (both initializations are independent of each other)
        PrototypeJavaClass prototypeJavaClass1 = (PrototypeJavaClass) contextFromComponentScanResource.getBean("myPrototypeJavaBean");
        PrototypeJavaClass prototypeJavaClass2 = (PrototypeJavaClass) contextFromComponentScanResource.getBean("myPrototypeJavaBean");
    }
}
