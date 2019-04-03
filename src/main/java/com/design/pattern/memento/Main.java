package com.design.pattern.memento;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-04-03 17:15:31
 **/
public class Main {

    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 10; i++) {
            System.out.println("==========" + i);
            System.out.println("当前状态：" + gamer);

            gamer.bet();

            System.out.println("所持金钱为" + gamer.getMoney() + "元");
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("所持金钱增加了许多，因此保存游戏当前的状态");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("所持金钱减少了许多，因此游戏恢复至以前的状态");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("");
        }
    }
}
