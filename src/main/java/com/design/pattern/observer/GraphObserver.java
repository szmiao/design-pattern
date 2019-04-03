package com.design.pattern.observer;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-04-03 16:21:54
 **/
public class GraphObserver implements Observer {

    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.print("GraphObserver:");
        int count = numberGenerator.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println("");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
