package com.design.pattern.builder;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-28 10:53:44
 **/
public class TextBuilder implements Builder {

    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("===========================\n");
        buffer.append("[" + title + "]\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("#" + str + "\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append("  ." + items[i] + "\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("===========================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
