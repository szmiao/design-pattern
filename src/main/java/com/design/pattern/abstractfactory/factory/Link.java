package com.design.pattern.abstractfactory.factory;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-28 13:15:09
 **/
public abstract class Link extends Item {

    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
