package com.manan.myspring.spring3.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionApplication {
    public static void main(String[] args) {
        // can use SpringBeansResource.xml too as SpringBeansResource2.xml is imported
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansResource2.xml");
        PrinterHelper printerHelper = (PrinterHelper) context.getBean("printerHelper");
        printerHelper.getPrinter().print();

        PrinterHelper printerHelper2 = (PrinterHelper) context.getBean("printerHelper2");
        printerHelper2.getPrinter().print();

        PrinterHelper printerHelper3 = (PrinterHelper) context.getBean("printerHelper3");
        printerHelper3.getPrinter().print();
        System.out.println(printerHelper3.getHelperName());

        // for a single injection, inner bean can be created
        PrinterHelper printerHelperInnerBean = (PrinterHelper) context.getBean("printerHelperInnerBean");
        printerHelperInnerBean.getPrinter().print();

        // to check ref local bean init
        PrinterHelper printerHelperExternalInternal = (PrinterHelper) context.getBean("printerHelperExternalInternal");
        printerHelperExternalInternal.getPrinter().print();
        System.out.println(printerHelperExternalInternal.getHelperName());

        // collections
        CollectionsBean collectionsBean = (CollectionsBean) context.getBean("myCollectionsBean");
        System.out.println(collectionsBean.toString());

        // custom property injection
        MyCustomPropertyEntity myCustomPropertyEntity = (MyCustomPropertyEntity) context.getBean("myCustomPropertyBean");
        System.out.println(myCustomPropertyEntity.toString());
        // custom property injection - spring's CustomDateEditor
        MyCustomPropertyEntity myCustomPropertyEntity2 = (MyCustomPropertyEntity) context.getBean("myCustomPropertyBean2");
        System.out.println(myCustomPropertyEntity2.toString());
        // custom property injection - custom entity and editor
        MyCustomPropertyEntity myCustomPropertyEntity3 = (MyCustomPropertyEntity) context.getBean("customPropertyEditorTryEntity");
        System.out.println(myCustomPropertyEntity3.toString());
    }
}
