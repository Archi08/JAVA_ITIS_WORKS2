import Auto.Car;

import storages.CarDataStorage;
import storages.DataStorageFactory;

public class Main {

    public static void main(String[] args) {

        CarDataStorage storage = DataStorageFactory.getCarsDataStorages();

        Car car = new Car("2108", "white", 350000);

           storage.save(car);




    }
}
