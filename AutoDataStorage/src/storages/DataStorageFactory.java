package storages;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataStorageFactory {

    public static CarDataStorage getCarsDataStorages() {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("resources\\app.properties"));
            String fileName = properties.getProperty("cars.file");
            return new CarDataStorage(fileName);
        } catch (IOException e) {
            System.err.println("IO Exception");
        }
        return null;
    }
}


