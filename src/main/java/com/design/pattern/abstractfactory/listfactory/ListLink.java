package com.design.pattern.abstractfactory.listfactory;

import com.design.pattern.abstractfactory.factory.Link;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-28 13:45:25
 **/
public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String markHtml() {
        return "<li><a href = \"" + url + "\">" + caption + "</li>\n";
    }
}
