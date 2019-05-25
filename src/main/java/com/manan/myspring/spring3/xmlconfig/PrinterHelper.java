package com.manan.myspring.spring3.xmlconfig;

public class PrinterHelper {
    IPrinter printer;
    String helperName;

    // creating Default Constructor to support setter injection as well
    public PrinterHelper() {
    }

    public PrinterHelper(IPrinter printer) {
        this.printer = printer;
    }

    public void setPrinter(IPrinter printer) {
        this.printer = printer;
    }

    public IPrinter getPrinter() {
        return printer;
    }

    public void setHelperName(String helperName) {
        this.helperName = helperName;
    }

    public String getHelperName() {
        return helperName;
    }
}
