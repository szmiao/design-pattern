package com.design.pattern.prototype.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-27 17:16:45
 **/
public class Manager {

    private Map<String, Product> showcase = new HashMap();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoName) {
        Product p = showcase.get(protoName);
        return p.createClone();
    }
}
