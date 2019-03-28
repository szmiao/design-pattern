package com.design.pattern.abstractfactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-28 13:21:54
 **/
public abstract class Page {

    protected String title;

    protected String author;

    protected ArrayList content = new ArrayList();


    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        String filename = title + ".html";
        try {
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename + "编写完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}
