package com.design.pattern.factory.idcard;

import com.design.pattern.factory.framework.Product;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-27 10:55:32
 **/
public class IDCard extends Product {

    private String owner;

    private int serial;

    /**
     * idcard包外的类无法new出IDCard类实例
     * 强迫外部必须通过IDCardFactory来生成IDCard的实例
     * @param owner
     * @param serial
     */
    IDCard(String owner, int serial) {

        System.out.println("制作" + owner + "(" + serial + ")" + "的Id card。");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {

        System.out.println("使用" + owner + "(" + serial + ")" + "的Id card。");
    }

    public String getOwner() {

        return owner;
    }

    public int getSerial() {
        return serial;
    }
}
