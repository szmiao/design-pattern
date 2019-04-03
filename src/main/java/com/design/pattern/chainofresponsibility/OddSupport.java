package com.design.pattern.chainofresponsibility;

/**
 * program: design-pattern
 * description: 解决奇数编号的问题
 * author: szmiao
 * version V1.0.0
 * create: 2019-04-03 09:50:56
 **/
public class OddSupport extends Support {

    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1) {
            return true;
        }
        return false;
    }
}
