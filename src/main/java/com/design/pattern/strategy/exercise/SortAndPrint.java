package com.design.pattern.strategy.exercise;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-29 11:03:23
 **/
public class SortAndPrint {

    Comparable[] data;

    Sorter sorter;

    public SortAndPrint(Comparable[] data, Sorter sorter) {
        this.data = data;
        this.sorter = sorter;
    }

    public void execute() {
        print();
        sorter.sort(data);
        print();
    }

    public void print() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",");
        }
        System.out.println("");
    }
}
