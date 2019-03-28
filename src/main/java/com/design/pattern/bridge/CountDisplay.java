package com.design.pattern.bridge;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-28 18:36:55
 **/
public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int items) {
        open();
        for (int i = 0; i < items; i++) {
            print();
        }
        close();
    }
}
