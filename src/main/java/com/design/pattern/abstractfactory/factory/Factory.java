package com.design.pattern.abstractfactory.factory;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-03-28 13:28:00
 **/
public abstract class Factory {

    public static Factory getFactory(String classesName) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(classesName).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("没有找到" + classesName + "类");
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}
