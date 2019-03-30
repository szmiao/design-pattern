package com.design.pattern.composite;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-29 15:26:03
 **/
public abstract class Entry {

    public abstract String getName();

    public abstract int getSize();

    /**
     * 加入目录条数
     * @param entry
     * @return
     * @throws FileTreatmentException
     */
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    /**
     * 显示目录条数一览
     */
    public void printList() {
        printList("");
    }

    /**
     * 为一览加上前缀并显示目录条目一览
     * @param prefix
     */
    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
