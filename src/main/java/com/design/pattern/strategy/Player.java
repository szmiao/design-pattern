package com.design.pattern.strategy;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-29 10:13:20
 **/
public class Player {

    private String name;

    private Strategy strategy;

    private int winCount;

    private int loseCount;

    private int gameCount;

    /**
     * 赋予姓名和策略
     * @param name
     * @param strategy
     */
    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    /**
     * 策略决定下一局要出的手势
     * @return
     */
    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        strategy.study(true);
        winCount++;
        gameCount++;
    }

    public void lose() {
        strategy.study(false);
        loseCount++;
        gameCount++;
    }

    public void even() {
        gameCount++;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", winCount=" + winCount +
                ", loseCount=" + loseCount +
                ", gameCount=" + gameCount +
                '}';
    }
}
