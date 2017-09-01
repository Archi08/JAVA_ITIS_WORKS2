package BucketSort;

/**
 * Created by tommy on 11.04.17.
 */
public class Human {
    private String name;
    private int date;
    private int month;
    private int years;

    public Human(String name, int date, int month, int years){
        try{if(name ==""){
            throw new IllegalArgumentException(" Имя не может быть пустым!");
        }else{
            this.name = name;
        }
        if(date>31 && date <1){
            throw new IllegalArgumentException(" Некорректная дата!"+date);
        }else{
            this.date = date;
        }
        if(month>12 && month<1){
            throw new IllegalArgumentException("Некорректное обозначения месяца"+month);
        }else{
            this.month = month;
        }
        if(years<=2017 && years>=1899){
            this.years = years;
        }else{
            throw new IllegalArgumentException("Некорретный год!"+years);
        }
    } catch( IllegalArgumentException e){
            System.err.println("Oops..."+e.getMessage());}
    }

    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }

    public int getYears() {
        return years;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", month=" + month +
                ", years=" + years +
                '}';
    }
}
