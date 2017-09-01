package task_25;


public class ParkingPlace {
    private Transport[] transports;
    private final int MAX_SIZE_PARKING=10;
    private int count_transport;

    public ParkingPlace(){
        transports = new Transport[MAX_SIZE_PARKING];
        count_transport =0;
    }
    private int getEmptyPlace(){
        int emptyPlace = 0;
        for(int i=0;i<transports.length;i++){
            if(transports[i]==null){
                emptyPlace = i;
                break;
            }
        }
        return emptyPlace;
    }
    public void park(Transport car){
        if(count_transport>=MAX_SIZE_PARKING){
            System.out.println("Нет свободного места на парковке!");
            return;
        }
        int emptyPlace = getEmptyPlace();
        transports[emptyPlace] = car;
        count_transport++;
        car.come();
    }
    private int findCar(int numberCar){
        int index=-1;
        for(int i=0;i<transports.length;i++){
            if(transports[i]!=null){
                if(transports[i].getCarNumbers()==numberCar){
                    index = i;
                    break;
                }
            }
        }
        return index;

    }
    public void removeTheCar(int numberCar){
        int indexCar = findCar(numberCar);
        if(indexCar!=-1){
            transports[indexCar].leave();
            transports[indexCar] = null;
            count_transport--;

        }else{
            System.out.println("Машины с номером "+numberCar+" нет на парковке");
        }
    }
    public void showParkingPlace(){
        System.out.println("Обзор парковки:");
        for(int i=0;i<transports.length;i++){
            if(transports[i]!=null){
                System.out.print(" ["+transports[i].getType()+"/("+transports[i].getCarNumbers()+")]");
            }else{
                System.out.print("[    ]");
            }
        }
        System.out.println();
    }
}
