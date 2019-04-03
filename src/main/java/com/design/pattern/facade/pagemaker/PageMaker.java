package com.design.pattern.facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-04-03 10:46:49
 **/
public class PageMaker {

    private PageMaker() {
    }

    public static void makeWelcomePage(String mailAddress, String fileName) {
        Properties mailProp = Database.getProperties("maildata");
        String username = mailProp.getProperty(mailAddress);
        try {
            HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph(username + "欢迎来到" + username + "的主页");
            writer.paragraph("等着你发邮件哦");
            writer.mailto(mailAddress, username);
            writer.close();
            System.out.println(fileName + " is created for " + mailAddress + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
