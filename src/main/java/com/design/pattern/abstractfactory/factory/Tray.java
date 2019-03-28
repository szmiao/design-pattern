package com.design.pattern.abstractfactory.factory;

import java.util.ArrayList;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-28 13:16:36
 **/
public abstract class Tray extends Item {

    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
