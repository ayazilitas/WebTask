package com.TaskRuut.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfıguratıonReader {


    private static Properties properties;

    static {

        try {
            String path = "Configurations.Properties";
            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);

            input.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static String get(String keyName) {
        return properties.getProperty(keyName);
    }

}
