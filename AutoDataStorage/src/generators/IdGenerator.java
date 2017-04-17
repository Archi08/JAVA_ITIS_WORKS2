package generators;


import java.io.*;

public class IdGenerator {

    private String idFileName;
    private  int lastGenerateId;

    public IdGenerator (String idFileName) {

        this.idFileName = idFileName;

        try{
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
