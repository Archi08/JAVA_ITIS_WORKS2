import Auto.Car;
import generators.IdGenerator;
import storages.CarDataStorages;

public class Main {

    public static void main(String[] args) {
        IdGenerator idGenerator = new IdGenerator("id.txt");
        CarDataStorages carDataStorages =
                new CarDataStorages("cars.txt", idGenerator);

        Car car = new Car("2109", "red", 350000);
        car.setId(7);
        carDataStorages.update(car);




    }
}
