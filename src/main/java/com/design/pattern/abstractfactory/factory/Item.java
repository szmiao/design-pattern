package com.design.pattern.abstractfactory.factory;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-28 13:12:27
 **/
public abstract class Item {

    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String markHtml();
}
