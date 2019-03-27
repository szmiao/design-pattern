package com.design.pattern.singleton;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-27 15:11:54
 **/
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("生成了一个实例");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
