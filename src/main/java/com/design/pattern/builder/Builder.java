package com.design.pattern.builder;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-28 10:47:35
 **/
public interface Builder {

    public void makeTitle(String title);

    public void makeString(String str);

    public void makeItems(String[] items);

    public void close();
}
