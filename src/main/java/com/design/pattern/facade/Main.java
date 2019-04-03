package com.design.pattern.facade;

import com.design.pattern.facade.pagemaker.PageMaker;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-04-03 10:53:43
 **/
public class Main {

    public static void main(String[] args) {
        PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
    }
}
