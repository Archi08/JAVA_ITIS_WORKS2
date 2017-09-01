package DAO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class UserDaoTextFileBaseImpl implements UserDao{

    BufferedReader reader;
    String fileName;

    private void InittializationReader(String fileName){
        try{
            reader = new BufferedReader(new FileReader(fileName));
        }catch(FileNotFoundException e){
            System.err.println("Oops.."+e.getMessage());
        }
    }

    public UserDaoTextFileBaseImpl(String fileName) {
        InittializationReader(fileName);
        this.fileName = fileName;
    }


    @Override
    public ArrayList<User> findAll() {

        ArrayList<User> users = new ArrayList<User>();
        try {
            if(reader == null){    //
                InittializationReader(this.fileName);
            }
           String current_user = reader.readLine();
           while (current_user!=null){
               String userData[] = current_user.split(" ");
               int user_id = Integer.parseInt(userData[0]);
               String userName = userData[1];
               User newUser = new User(userName,user_id);
               users.addToEnd(newUser);
               current_user = reader.readLine();
           }
            reader.close();
           reader = null;

        } catch (IOException e) {
            e.getMessage();
        }

        return users;
    }
}
