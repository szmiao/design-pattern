package com.design.pattern.facade.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * program: design-pattern
 * description:
 * author: szmiao
 * version V1.0.0
 * create: 2019-04-03 10:31:55
 **/
public class Database {

    private Database() {
    }

    public static Properties getProperties(String dbName) {
        String fileName = "src/main/java/com/design/pattern/facade/" + dbName + ".txt";
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(fileName));
        } catch (IOException e) {
            System.out.println("Warning:" + fileName + "is not found.");
        }
        return properties;
    }
}
