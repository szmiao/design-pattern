package com.design.pattern.adapter.object;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-26 19:15:27
 **/
public class Main {

    public static void main(String[] args) {

        Print p = new PrintBanner("Hello");
        p.printStrong();
        p.printWeak();
    }
}
