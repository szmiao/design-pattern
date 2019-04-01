package com.design.pattern.decorator;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-04-01 09:30:24
 **/
public class Main {

    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, World.");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
        Display b4 =
                new SideBorder(
                    new FullBorder(
                            new FullBorder(
                                    new SideBorder(
                                            new FullBorder(
                                                    new StringDisplay("你好，世界。")
                                            ),
                                            '*'
                                    )
                            )
                    ),
                        '/'
                );
        b4.show();
    }
}
