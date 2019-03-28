package com.design.pattern.factory.idcard;

import com.design.pattern.factory.framework.Factory;
import com.design.pattern.factory.framework.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-27 10:59:27
 **/
public class IDCardFactory extends Factory {

    private Map<Integer, String> map = new HashMap();

    private int serial = 100;

    @Override
    protected synchronized Product createProduct(String owner) {

        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {

        IDCard idCard = (IDCard) product;
        map.put(idCard.getSerial(), idCard.getOwner());
    }

    public Map<Integer, String> getMap() {
        return map;
    }
}
