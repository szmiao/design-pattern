package com.design.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-04-03 17:01:02
 **/
public class Memento {

    int money;

    ArrayList fruits;

    public int getMoney() {
        return money;
    }

    public Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    void addFruits(String fruit) {
        fruits.add(fruit);
    }

    List getFruits() {
        return (List) fruits.clone();
    }
}
