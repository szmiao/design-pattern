package com.design.pattern.abstractfactory.listfactory;

import com.design.pattern.abstractfactory.factory.Item;
import com.design.pattern.abstractfactory.factory.Page;

import java.util.Iterator;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-28 13:50:15
 **/
public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<html><head><title>" + title + "</title></head>\n");
        stringBuffer.append("<body>\n");
        stringBuffer.append("<h1>" + title + "</h1>\n");
        stringBuffer.append("<ul>\n");
        Iterator iterator = content.iterator();
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            stringBuffer.append(item.markHtml());
        }
        stringBuffer.append("</ul>\n");
        stringBuffer.append("<hr><address>" + author + "</address>\n");
        stringBuffer.append("</body></html>\n");
        return stringBuffer.toString();
    }
}
