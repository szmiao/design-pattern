package com.design.pattern.visitor;

public interface Element {

    public abstract void accept(Visitor v);
}
