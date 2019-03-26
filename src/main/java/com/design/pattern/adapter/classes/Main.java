package com.design.pattern.adapter.classes;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-26 18:58:07
 **/
public class Main {

    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printStrong();
        p.printWeak();
    }
}
