package com.manan.myspring.spring3.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionApplication {
    public static void main(String[] args) {
        // can use SpringBeansResource.xml too as SpringBeansResource2.xml is imported
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansResource2.xml");
        PrinterHelper printerHelper = (PrinterHelper) context.getBean("printerHelper");
        printerHelper.getPrinter().print();
    }
}
