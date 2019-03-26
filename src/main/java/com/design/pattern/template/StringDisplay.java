package com.design.pattern.template;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-26 19:53:15
 **/
public class StringDisplay extends AbstractDisplay {

    private String string;

    private Integer length;

    public StringDisplay(String string) {
        this.string = string;
        this.length = string.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    private void printLine() {

        System.out.print("+");
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }
}
