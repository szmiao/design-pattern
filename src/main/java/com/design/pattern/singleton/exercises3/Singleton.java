package com.design.pattern.singleton.exercises3;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-27 15:53:41
 **/
public class Singleton {

    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("生成了一个实例");
        slowdown();
    }

    private void slowdown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
