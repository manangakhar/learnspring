package com.manan.myspring.spring3.xmlconfig;

public class PrinterHelper {
    IPrinter printer;

    public void setPrinter(IPrinter printer) {
        this.printer = printer;
    }

    public IPrinter getPrinter() {
        return printer;
    }
}
