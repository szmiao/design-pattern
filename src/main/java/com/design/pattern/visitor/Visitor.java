package com.design.pattern.visitor;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-04-01 14:43:31
 **/
public abstract class Visitor {

    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
