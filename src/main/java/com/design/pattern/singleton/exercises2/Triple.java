package com.design.pattern.singleton.exercises2;

/**
 * program: design-pattern
 * description: 实现最多生成3个Triple类的实例
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-27 15:26:25
 **/
public class Triple {

    private static Triple[] triple = new Triple[] {
        new Triple(0),
        new Triple(1),
        new Triple(2)
    };

    private int id;

    private Triple(int id) {
        System.out.println("The instance " + id + " is created.");
        this.id = id;
    }

    public static Triple getInstance(int id) {
        return triple[id];
    }

    @Override
    public String toString() {
        return "Triple{" +
                "id=" + id +
                '}';
    }
}
