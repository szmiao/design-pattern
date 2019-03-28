package com.design.pattern.bridge;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-28 18:48:53
 **/
public class Main {

    public static void main(String[] args) {
        Display display = new Display(new StringDisplayImpl("Hello, China."));
        Display display1 = new Display(new StringDisplayImpl("Hello, World."));
        CountDisplay countDisplay = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        display.display();
        display1.display();
        countDisplay.display();
        countDisplay.multiDisplay(5);
    }
}
