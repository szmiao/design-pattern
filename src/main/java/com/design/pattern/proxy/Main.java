package com.design.pattern.proxy;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-04-09 16:58:01
 **/
public class Main {

    public static void main(String[] args) {
        Printable printable = new PrinterProxy("Alice");
        System.out.println("现在的名字是" + printable.getPrinterName());
        printable.setPrinterName("Bob");
        System.out.println("现在的名字是" + printable.getPrinterName());
        printable.print("Hello World");
    }
}
