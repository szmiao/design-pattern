package com.design.pattern.abstractfactory.listfactory;

import com.design.pattern.abstractfactory.factory.Factory;
import com.design.pattern.abstractfactory.factory.Link;
import com.design.pattern.abstractfactory.factory.Page;
import com.design.pattern.abstractfactory.factory.Tray;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-28 13:44:32
 **/
public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
