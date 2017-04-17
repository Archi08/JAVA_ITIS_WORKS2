package services;


import Auto.Car;
import storages.CarDataStorages;

public class CarService {

    private CarDataStorages carDataStorages;

    public CarService(CarDataStorages carDataStorages) {
        this.carDataStorages = carDataStorages;
    }

    public void register(Car car) {
        carDataStorages.save(car);
    }
}
