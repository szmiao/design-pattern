package com.design.pattern.adapter.object;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-26 19:12:40
 **/
public class PrintBanner extends Print {

    private Banner banner;

    public PrintBanner(String s) {
        this.banner = new Banner(s);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
