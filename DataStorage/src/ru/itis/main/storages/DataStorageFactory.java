package ru.itis.main.storages;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataStorageFactory {
    public static UsersDataStorage getUsersDataStorage() {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("resources\\app.properties"));
            String fileName = properties.getProperty("users.file");
            return new UsersDataStorage(fileName);
        } catch (IOException e) {
            System.err.println("IO Exception");
        }
        return null;
    }
}