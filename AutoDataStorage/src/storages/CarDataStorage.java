package storages;


import Auto.Car;

import exception.CarNotFoundException;

import generators.SingletonIdGenerator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CarDataStorage {

    private String fileName;


    public CarDataStorage(String fileName) {
        this.fileName = fileName;

    }

    public int save(Car car) {
        try{
            car.setId(SingletonIdGenerator.getGenerator().generateId());
            BufferedWriter writer = new BufferedWriter
                    (new FileWriter(fileName, true));
            String carDataAsString = car.toString();
            writer.write(carDataAsString);
            writer.newLine();
            writer.close();
            return car.getId();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("IO Exception");
        }
        return -1;
    }

    public Car find(int id) {

        try {
            BufferedReader reader =
                    new BufferedReader(new FileReader(fileName));
            String currentCarData = reader.readLine();

            while (currentCarData != null) {
                String currentCarDataAsArray[] =
                        currentCarData.split(" ");

                int currentCarId =
                        Integer.parseInt(currentCarDataAsArray[0]);

                if (currentCarId == id) {
                    Car founded = new Car(
                            currentCarDataAsArray[1],
                            currentCarDataAsArray[2],
                            Integer.parseInt(currentCarDataAsArray[3]));
                    founded.setId(id);
                    reader.close();
                    return founded;
                }
                currentCarData = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("IO Exception");
        }
        throw new CarNotFoundException();
    }

    public List<Car> findAll() {
        try {
            ArrayList<Car> addCars = new ArrayList<>();

            BufferedReader reader =
                    new BufferedReader(new FileReader(fileName));
            String currentCarData = reader.readLine();

            while (currentCarData != null) {
                String currentCarDataAsArray[] =
                        currentCarData.split(" ");

                int currentCarId =
                        Integer.parseInt(currentCarDataAsArray[0]);
                Car founded = new Car(
                        currentCarDataAsArray[1],
                        currentCarDataAsArray[2],
                        Integer.parseInt(currentCarDataAsArray[3]));
                founded.setId(currentCarId);
                addCars.add(founded);
                currentCarData = reader.readLine();
            }

            return addCars;
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("IO Exception");
        }
        return null;
    }

    public void delete (int id) {

        List<Car> buffer = findAll();
        int indexOfDeleted = -1;

        for (int i = 0; i < buffer.size(); i++) {
            Car currentCar = buffer.get(i);
            if (currentCar.getId() == id) {
                indexOfDeleted = i;
                break;
            }
        }

        if (indexOfDeleted > -1) {
            buffer.remove(indexOfDeleted);
        }

        flushFromBuffer(buffer);
    }

    private void flushFromBuffer(List<Car> buffer) {
        try {
            BufferedWriter writer =
                    new BufferedWriter(new FileWriter(fileName));

            for (int a = 0; a < buffer.size(); a++) {
                writer.write(buffer.get(a).toString());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.err.println("IO Exception");
        }
    }

    public void update (Car car) {
        List<Car> updateList = findAll();
            int updateIdCar = car.getId();

        for (int i = 0; i < updateList.size(); i++) {
            Car currentCar = updateList.get(i);
            if (updateIdCar == currentCar.getId()) {
                updateList.set(i,car);
            break;
            }

        }
        flushFromBuffer(updateList);
    }
}
