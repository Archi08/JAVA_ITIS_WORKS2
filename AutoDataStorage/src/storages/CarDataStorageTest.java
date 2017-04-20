package storages;

import Auto.Car;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CarDataStorageTest {

    private CarDataStorage carDataStorage;

    @Before
    public void setUp() throws Exception {
     //   this.carDataStorage = new CarDataStorage("test\\car.txt",
       //         new IdGenerator("test\\id.txt"));
    }

    @Test
    public void testFind() throws Exception {
        Car expected = new Car(7, "2109", "red", 350000);
        Car actual = carDataStorage.find(7);

        assertEquals(expected, actual);
    }



}