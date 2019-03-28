package com.design.pattern.abstractfactory;

import com.design.pattern.abstractfactory.factory.Factory;
import com.design.pattern.abstractfactory.factory.Link;
import com.design.pattern.abstractfactory.factory.Page;
import com.design.pattern.abstractfactory.factory.Tray;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-28 13:34:05
 **/
public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
        }
        Factory factory = Factory.getFactory("com.design.pattern.abstractfactory.listfactory.ListFactory");

        Link people = factory.createLink("人民日报", "http://ww.people.com.cn/");
        Link gmw = factory.createLink("光明日报", "http://ww.gmw.cn/");

        Link us_yahoo = factory.createLink("Yahoo!", "http://ww.yahoo.com/");

        Tray trayNews = factory.createTray("日报");
        trayNews.add(people);
        trayNews.add(gmw);

        Tray yahoo = factory.createTray("yahoo");
        yahoo.add(us_yahoo);

        Page page = factory.createPage("LinkPage", "szmiao");
        page.add(trayNews);
        page.add(yahoo);
        page.output();
    }
}
