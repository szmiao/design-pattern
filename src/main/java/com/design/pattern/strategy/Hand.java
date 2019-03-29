package com.design.pattern.strategy;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-29 09:43:47
 **/
public class Hand {

    // 石头的值
    public static final int HAND_VALUE_GUU = 0;

    // 剪刀的值
    public static final int HAND_VALUE_CHO = 1;

    // 布的值
    public static final int HAND_VALUE_PAA = 2;

    /**
     * 猜拳中的3中手势
     */
    public static final Hand[] hand = {
        new Hand(HAND_VALUE_GUU),
        new Hand(HAND_VALUE_CHO),
        new Hand(HAND_VALUE_PAA)
    };

    /**
     * 猜拳中手势所对应的的字符串
     */
    private static final String[] name = {
        "石头", "剪刀", "布",
    };

    /**
     * 猜拳中出的手势值
     */
    private int handValue;

    public Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return hand[handValue];
    }

    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;
    }

    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }

    private int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handValue + 1) % 3 == h.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    public String string() {
        return name[handValue];
    }
}
