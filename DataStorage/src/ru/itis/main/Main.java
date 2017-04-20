package ru.itis.main;

import ru.itis.main.generators.IdGenerator;
import ru.itis.main.generators.SingletonIdGenerator;
import ru.itis.main.models.User;
import ru.itis.main.storages.DataStorageFactory;
import ru.itis.main.storages.UsersDataStorage;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        UsersDataStorage storage = DataStorageFactory.getUsersDataStorage();
        User user = new User("ayazTheBest", "qwerty008", "Ayaz", 29);
        storage.save(user);



    }
}
