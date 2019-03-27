package com.design.pattern.factory;

import com.design.pattern.factory.framework.Factory;
import com.design.pattern.factory.framework.Product;
import com.design.pattern.factory.idcard.IDCardFactory;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-27 11:03:13
 **/
public class Main {

    public static void main(String[] args) {

        Factory factory = new IDCardFactory();
        Product p1 = factory.create("小红");
        Product p2 = factory.create("小绿");
        Product p3 = factory.create("小兰");
        Product p4 = factory.create("小明");
        p1.use();
        p2.use();
        p3.use();
        p4.use();
    }
}
