package com.covalense.selenium.TheHostller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyReader {

    private static Properties properties = new Properties();

    static {
        String filepath = System.getProperty("user.dir") + "/src/main/java/com/covalense/selenium/TheHostller/credentials.properties";
        try (FileInputStream fileInputStream = new FileInputStream(filepath)) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
