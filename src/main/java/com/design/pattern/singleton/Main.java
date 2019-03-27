package com.design.pattern.singleton;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-27 15:13:26
 **/
public class Main {

    public static void main(String[] args) {

        System.out.println("Start.");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("相同的实例");
        } else {
            System.out.println("不同的实例");
        }

        System.out.println("End.");
    }
}
