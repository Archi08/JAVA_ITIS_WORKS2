package ru.itis.main.generators;

import java.io.*;
import java.util.Properties;

/**
 * 18.04.2017
 * SingletonIdGenerator
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
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

    // имя файла, в котором лежит последний
    // сгенерированный id
    private String idFileName;

    // поле, в котором содержится последний сгенерированный id
    private int lastGeneratedId;

    private SingletonIdGenerator(String idFileName) {
        this.idFileName = idFileName;
        try {
            BufferedReader bufferedReader
                    = new BufferedReader(
                    new FileReader(idFileName));
            String id = bufferedReader.readLine();
            lastGeneratedId = Integer.parseInt(id);
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("IO Exception");
        }
    }

    public static SingletonIdGenerator getGenerator() {
        return instance;
    }

    /**
     * Генерирует новый id,всегда уникальный
     * и всегда на один больше, чем последний сгенерированный
     * @return сгенерированный идентификатор
     */
    public int generateId() {
        int newId = lastGeneratedId + 1;
        lastGeneratedId = newId;
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
