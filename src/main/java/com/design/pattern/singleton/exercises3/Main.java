package com.design.pattern.singleton.exercises3;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-27 16:06:19
 **/
public class Main extends Thread{

    public static void main(String[] args) {
        System.out.println("Start.");
        new Main("A").start();
        new Main("B").start();
        new Main("C").start();
        new Main("D").start();
        new Main("E").start();
        System.out.println("End.");
    }

    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        System.out.println(getName() + ": obj = " + singleton);
    }

    public Main(String name) {
        super(name);
    }
}
