package generators;


import java.io.*;
import java.util.Properties;

public class SingletonIdGenerator {

    private static SingletonIdGenerator instance;

    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("resources\\app.properties"));
            String fileName = properties.getProperty("id.generator.file");
            instance = new SingletonIdGenerator(fileName);
        } catch (IOException e) {
            System.err.println("IO Exception");
        }
    }

    private String idFileName;
    private  int lastGenerateId;

    private  SingletonIdGenerator(String idFileName) {
        this.idFileName = idFileName;
        try {
            BufferedReader bufferedReader = new BufferedReader
                    (new FileReader(idFileName));

            String id = bufferedReader.readLine();
            lastGenerateId = Integer.parseInt(id);
        }   catch (FileNotFoundException e) {
            System.err.println("File not found");
        }   catch (IOException e) {
            System.err.println("IO Exception");
        }
    }
    public static SingletonIdGenerator getGenerator() {
        return instance;
    }

    public int generateId() {

        int newId = lastGenerateId + 1;
        lastGenerateId = newId;
        try {
            Writer writer = new FileWriter(idFileName);
            writer.write(newId + "");
            writer.close();
        } catch (IOException e) {
            System.err.println("IO Exception");
        }
        return newId;
    }
}
