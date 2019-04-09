package com.design.pattern.flyweight;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-04-09 16:11:37
 **/
public class Main {

    public static void main(String[] args) {
        String name="221100";
        testMemory( name, false);
        testMemory( name, true);
    }

    public static void testMemory(String name,boolean isUsed){
        System.out.println("是否使用轻量级："+isUsed);
        BigString bs = new BigString(name,isUsed);
        bs.print();
        countMemory();
        System.out.println("=================");
    }

    public static void countMemory(){
        Runtime.getRuntime().gc();
        System.out.println("已使用内存:"+(Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory()));
    }
}
