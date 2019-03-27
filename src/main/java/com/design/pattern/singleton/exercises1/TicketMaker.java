package com.design.pattern.singleton.exercises1;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-27 15:19:12
 **/
public class TicketMaker {

    private int ticket = 1000;

    private static TicketMaker singleton = new TicketMaker();

    private TicketMaker() {
    }

    public static TicketMaker getInstance() {

        return singleton;
    }

    public synchronized int getNextTicketNum() {

        return ticket++;
    }
}
