package services;


import Auto.Car;
import storages.CarDataStorage;

public class CarService {

    private CarDataStorage carDataStorage;

    public CarService(CarDataStorage carDataStorage) {
        this.carDataStorage = carDataStorage;
    }

    public void register(Car car) {
        carDataStorage.save(car);
    }


}
