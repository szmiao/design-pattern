package com.design.pattern.strategy;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-29 10:17:53
 **/
public class Main {

    public static void main(String[] args) {
        int seed1 = 0;
        int seed2 = 1;
        Player player = new Player("小明", new WinningStrategy(seed1));
        Player player1 = new Player("小红", new ProbStrategy(seed2));

        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = player.nextHand();
            Hand nextHand2 = player1.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner: " + player);
                player.win();
                player1.lose();
            } else if (nextHand1.isWeakerThan(nextHand2)) {
                System.out.println("Winner: " + player1);
                player1.win();
                player.lose();
            } else {
                System.out.println("Even.... ");
                player.even();
                player1.even();
            }
        }
        System.out.println("Total result:");
        System.out.println(player.toString());
        System.out.println(player1.toString());
    }
}
