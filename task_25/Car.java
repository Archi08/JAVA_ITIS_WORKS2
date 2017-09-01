package task_25;

/**
 * Created by tommy on 26.03.17.
 */
public class Car  extends Transport{
    private int carNumbers;
    private String color;

    public Car(int carNambers, String color, String type, int weigh){
        super(type,weigh);
        this.carNumbers = carNambers;
        this.color = color;
    }
    public void leave(){
        System.out.println("Машина "+super.getType()+" под номером "+this.carNumbers+" уехала из парковки");
    }

    public int getCarNumbers() {
        return carNumbers;
    }

    public String getColor() {
        return color;
    }

    public void come(){
        System.out.println("Машина "+super.getType()+" под номером "+this.carNumbers+" подъехала на парковку");
    }
}
