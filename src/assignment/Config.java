/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;
import java.util.Properties;
import java.io.InputStream;
/**
 *
 * @author vallerie
 */
public class Config {
    private static Properties properties;

    static {
        properties = new Properties();
        try (InputStream input = Config.class.getClassLoader().getResourceAsStream("assignment/config.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
            }
            properties.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getFilePath(String key) {
        return properties.getProperty(key);
    }
}
