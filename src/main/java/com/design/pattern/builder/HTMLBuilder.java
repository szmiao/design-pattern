package com.design.pattern.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-28 11:00:03
 **/
public class HTMLBuilder implements Builder {

    private String filename;

    private PrintWriter printWriter;

    @Override
    public void makeTitle(String title) {
        filename = title + ".html";
        try {
            printWriter = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        printWriter.print("<html><head><title>" + "title" + "</title></head><body>");
        // 输出标题
        printWriter.print("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) {
        printWriter.print("<p>" + str + "</p>");
    }

    @Override
    public void makeItems(String[] items) {
        printWriter.print("<ul>");
        for (int i = 0; i < items.length; i++) {
            printWriter.print("<li>" + items[i] + "</li>");
        }
        printWriter.print("</ul>");
    }

    @Override
    public void close() {
        printWriter.print("</body></html>");
        printWriter.close();
    }

    public String getResult() {
        return filename;
    }
}
