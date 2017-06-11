package ru.itis.main.storages;

import ru.itis.main.exceptions.UserNotFoundException;
import ru.itis.main.generators.IdGenerator;
import ru.itis.main.generators.SingletonIdGenerator;
import ru.itis.main.models.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public  class UsersDataStorage {


    private String fileName;


    public UsersDataStorage(String fileName) {
        this.fileName = fileName;

    }

    public int save(User user) {
        try {
            user.setId(SingletonIdGenerator.getGenerator().generateId());
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            String userDataAsString = user.toString();
            writer.write(userDataAsString);
            writer.newLine();
            writer.close();
            return user.getId();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("IO Exception");
        }

        return -1;
    }

    public User find(int id) {
        try {
            BufferedReader reader =
                    new BufferedReader(new FileReader(fileName));

            String currentUserData = reader.readLine();

            while (currentUserData != null) {
                String currentUserDataAsArray[] =
                        currentUserData.split(" ");

                int currentUserId =
                        Integer.parseInt(currentUserDataAsArray[0]);

                if (currentUserId == id) {
                    User founded = new User(
                            currentUserDataAsArray[1],
                            currentUserDataAsArray[2],
                            currentUserDataAsArray[3],
                            Integer.parseInt(currentUserDataAsArray[4]));
                    founded.setId(id);
                    reader.close();
                    return founded;
                }
                currentUserData = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("IO Exception");
        }
        throw new UserNotFoundException("User not found");
    }

    public List<User> findAll() throws Exception {
        try {
            ArrayList<User> addUsers = new ArrayList<>();
            BufferedReader reader =
                    new BufferedReader(new FileReader(fileName));

            String currentUserData = reader.readLine();

            while (currentUserData != null) {
                String currentUserDataAsArray[] =
                        currentUserData.split(" ");

                int currentUserId =
                        Integer.parseInt(currentUserDataAsArray[0]);
                User founded = new User(
                        currentUserDataAsArray[1],
                        currentUserDataAsArray[2],
                        currentUserDataAsArray[3],
                        Integer.parseInt(currentUserDataAsArray[4]));
                founded.setId(currentUserId);
                addUsers.add(founded);
                currentUserData = reader.readLine();
            }
            return addUsers;
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("IO Exception");
        }
        return null;
    }

    public  void  delete(int id) throws Exception   {
        // получили всех пользователей
        List<User> buffer = findAll();
        // индекс удаляемого пользователя в списке
        int indexOfDeleted = -1;
        // идем по всему списку
        for (int i = 0; i < buffer.size(); i++) {
            // получаем текущего i-го пользователя
            User currentUser = buffer.get(i);
            // если id просматриваемого пользователя
            // совпал с id пользователя, которого мы хотим удалить
            if (currentUser.getId() == id) {
                // запоминаем его индекс
                indexOfDeleted = i;
                // останавливаем цикл
                break;
            }
        }
        // если мы нашли пользователя, которого надо удалить
        if (indexOfDeleted > -1) {
            // удаляем
            buffer.remove(indexOfDeleted);
        }

        flushFromBuffer(buffer);
    }

    private void flushFromBuffer(List<User> buffer) {
        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(fileName));

            for (int i = 0; i < buffer.size(); i++) {
                writer.write(buffer.get(i).toString());
                writer.newLine();
            }

            writer.close();
        } catch (IOException e) {
            System.err.println("IO Exception");
        }
    }

    public void update (User user) throws Exception {

        List<User> buffer = findAll();

        for (int i = 0; i < buffer.size(); i++) {

            User currentUser = buffer.get(i);

            if (currentUser.getId() == user.getId()) {
                 buffer.set(i, user);
                break;
            }
        }

        flushFromBuffer(buffer);
    }

}

