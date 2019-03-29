package com.design.pattern.strategy.exercise;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-29 11:06:06
 **/
public class Main {

    public static void main(String[] args) {
        String[] data = {
            "Dumpty", "Bowman", "Carroll", "Elfland", "Alice"
        };
        SortAndPrint sortAndPrint = new SortAndPrint(data, new SelectionSorter());
        sortAndPrint.execute();
    }
}
