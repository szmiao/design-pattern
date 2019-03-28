package com.design.pattern.abstractfactory.listfactory;

import com.design.pattern.abstractfactory.factory.Item;
import com.design.pattern.abstractfactory.factory.Tray;

import java.util.Iterator;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-28 13:47:16
 **/
public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String markHtml() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<li>\n");
        stringBuffer.append(caption + "\n");
        stringBuffer.append("<ul>\n");
        Iterator iterator = tray.iterator();
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            stringBuffer.append(item.markHtml());
        }
        stringBuffer.append("</ul>\n");
        stringBuffer.append("</li>\n");
        return stringBuffer.toString();
    }
}
