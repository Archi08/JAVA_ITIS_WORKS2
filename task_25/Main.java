package task_25;


public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(347,"white","KIA", 1700);
        Car car2 = new Car(876,"blue","AUDI", 2300);
        Car car3 = new Car(457,"red","SKODA", 1500);
        Car car4 = new Car(190,"black","CHEVROLET", 1700);
        Car car5 = new Car(345,"orange","BMV", 1700);
        Car car6 = new Car(986,"purple","OPEL", 1700);
        Car car7 = new Car(574,"pink","NISSAN", 980);

        ParkingPlace parkingPlace = new ParkingPlace();
        parkingPlace.park(car1);
        parkingPlace.park(car2);
        parkingPlace.park(car3);
        parkingPlace.park(car4);
        parkingPlace.park(car5);
        parkingPlace.showParkingPlace();
        parkingPlace.removeTheCar(190);
        parkingPlace.removeTheCar(876);
        parkingPlace.showParkingPlace();
        parkingPlace.park(car6);
        parkingPlace.park(car7);
        parkingPlace.showParkingPlace();

    }
}
