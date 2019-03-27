package com.design.pattern.prototype.framework;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-27 17:13:58
 **/
public abstract class Product implements Cloneable {

    public abstract void use(String s);

    public final Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
