package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private Properties prop;

    public ConfigReader() {
        try {
            FileInputStream fis = new FileInputStream("data.properties");
            prop = new Properties();
            prop.load(fis);
        } catch (IOException e) {
            System.out.println("Error loading config file: " + e.getMessage());
        }
    }

    public String getProperty(String key) {
        return prop.getProperty(key);
    }
}
