package com.design.pattern.prototype;

import com.design.pattern.prototype.framework.Manager;
import com.design.pattern.prototype.framework.Product;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-27 17:28:19
 **/
public class Main {

    public static void main(String[] args) {
        // ready
        Manager manager = new Manager();
        UnderLinePen underLinePen = new UnderLinePen('~');
        MessageBox messageBox = new MessageBox('*');
        MessageBox box = new MessageBox('/');
        manager.register("strong message", underLinePen);
        manager.register("warning box", messageBox);
        manager.register("slash box", box);

        // go
        Product product1 = manager.create("strong message");
        product1.use("Hello World");
        Product product2 = manager.create("warning box");
        product2.use("Hello World");
        Product product3 = manager.create("slash box");
        product3.use("Hello World");
    }

}
