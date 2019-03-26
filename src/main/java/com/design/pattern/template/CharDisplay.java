package com.design.pattern.template;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-26 19:51:21
 **/
public class CharDisplay extends AbstractDisplay {

    private String string;

    public CharDisplay(String string) {
        this.string = string;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(string);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
