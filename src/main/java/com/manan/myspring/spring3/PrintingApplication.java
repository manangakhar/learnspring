package com.manan.myspring.spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrintingApplication {

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        final IPrinter iPrinter = (IPrinter) context.getBean("printer");
        iPrinter.print();
        System.out.println();
    }
}
