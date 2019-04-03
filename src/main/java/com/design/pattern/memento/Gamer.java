package com.design.pattern.memento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-04-03 17:04:21
 **/
public class Gamer {

    private int money;

    private List fruits = new ArrayList();

    private Random random = new Random();

    private static String[] fruitsName = {
            "苹果", "葡萄", "香蕉", "橘子"
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("dice = " + dice + "所持金钱增加了");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("dice = " + dice + "所持金钱减半了");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("dice = " + dice + "获得了水果(" + f + ")");
            fruits.add(f);
        } else {
            System.out.println("none");
        }
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "好吃的";
        }
        return prefix + fruitsName[random.nextInt(fruitsName.length)];
    }

    public Memento createMemento() {
        Memento memento = new Memento(money);
        Iterator iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String f = (String) iterator.next();
            if (f.startsWith("好吃的")) {
                memento.addFruits(f);
            }
        }
        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }
}
