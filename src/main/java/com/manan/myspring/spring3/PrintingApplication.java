package com.manan.myspring.spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class PrintingApplication {

    public static void main(String[] args) {
        // bean file to be put in resources for classpath
        ApplicationContext contextFromResource = new ClassPathXmlApplicationContext("SpringBeansResource.xml");
        // bean file can be put anywhere if file system context
        ApplicationContext contextFromFile = new FileSystemXmlApplicationContext
                ("src/main/java/com/manan/myspring/spring3/SpringBeansFile.xml");
        // prints json
        final IPrinter iPrinterFromResource = (IPrinter) contextFromResource.getBean("printer");
        iPrinterFromResource.print();
        // prints csv
        final IPrinter iPrinterFromFile = (IPrinter) contextFromFile.getBean("printer");
        iPrinterFromFile.print();
        
    }
}
