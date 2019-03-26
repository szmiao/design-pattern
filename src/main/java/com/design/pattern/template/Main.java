package com.design.pattern.template;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-26 19:56:40
 **/
public class Main {

    public static void main(String[] args) {

        AbstractDisplay charDisplay = new CharDisplay("hello");
        charDisplay.display();
        AbstractDisplay stringDisplay = new StringDisplay("hello, world");
        stringDisplay.display();
        AbstractDisplay stringDisplay1 = new StringDisplay("你好，世界");
        stringDisplay1.display();
    }
}
