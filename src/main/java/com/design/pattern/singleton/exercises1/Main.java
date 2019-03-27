package com.design.pattern.singleton.exercises1;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-27 15:22:53
 **/
public class Main {

    public static void main(String[] args) {

        System.out.println("Start.");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + TicketMaker.getInstance().getNextTicketNum());
        }
        System.out.println("End.");
    }
}
