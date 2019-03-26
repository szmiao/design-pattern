package com.design.pattern.template;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-26 19:49:04
 **/
public abstract class AbstractDisplay {

    public abstract void open();

    public abstract void print();

    public abstract  void close();

    public final void display() {

        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
