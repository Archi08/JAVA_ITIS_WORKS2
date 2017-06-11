package ru.itis.main.storages;

import org.junit.Before;
import org.junit.Test;
import ru.itis.main.exceptions.UserNotFoundException;
import ru.itis.main.generators.IdGenerator;
import ru.itis.main.models.User;
import ru.itis.main.storages.UsersDataStorage;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class UsersDataStorageTest {



    private UsersDataStorage usersDataStorage;

    @Before
    public void setUp() throws Exception {
        this.usersDataStorage = DataStorageFactory.getUsersDataStorage();

    }

    @Test
    public void testFind() throws Exception {
        User expected = new User(9, "oleg", "qwerty10", "Oleg", 99);
        User actual = usersDataStorage.find(9);

        assertEquals(expected, actual);
    }

    @Test(expected = UserNotFoundException.class)
    public void testFindOnIncorrectData1() throws Exception {
        usersDataStorage.find(10);
    }

    @Test
    public void testSave() throws Exception {
        User expected = new User("oleg", "qwerty10", "Oleg", 99);
        usersDataStorage.save(expected);
        User actual = usersDataStorage.find(expected.getId());

        assertEquals(expected, actual);
    }

    @Test(expected = UserNotFoundException.class)
    public void testDelete() throws Exception {
        User expected = new User("oleg", "qwerty10", "Maksim", 99);
        usersDataStorage.save(expected);
        usersDataStorage.delete(expected.getId());
        usersDataStorage.find(expected.getId());
    }

    @Test
    public void testUpdate() throws Exception {
        User expected = new User(8,"fedka", "qwerty10", "Fedor", 19);
        usersDataStorage.update(expected);
        User actual = usersDataStorage.find(8);

        assertEquals(expected, actual);
    }

    @Test
    public void testFindAll() throws Exception {
        List<User> expected = new ArrayList<>();
        User user = new User(12, "fedka", "qwerty10", "Fedor", 50);
        expected.add(user);
        List<User> actual = usersDataStorage.findAll();

        assertEquals(expected, actual);
    }

}



