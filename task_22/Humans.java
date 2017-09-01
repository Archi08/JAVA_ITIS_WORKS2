package task_22;

/**
 * Created by Аюпов Аяз on 27.03.2017.
 */
public class Humans {
    private String name;
    private int date;
    private int month;
    private int years;

    public Humans(String name, int date, int month, int years) {
        this.name = name;
        if(date >0 && date <= 31){this.date = date;}else{
            System.out.println("Не корректная дата!");
            return;
        }
        if(month>0 && month <=12){this.month = month;}else{
            System.out.println("Не корректно введен месяц");
            return;
        }
        if(years > 1940 && years <= 2017){
        this.years = years;}else{
            System.out.println("не корректно введен год!");
            return;
        }
    }

    public String getName() {
        return name;
    }

    public int getYears() {
        return years;
    }

    public int getMonth() {

        return month;
    }

    public int getDate() {

        return date;
    }

    @Override
    public String toString() {

       return name+" "+date+"."+month+"."+years+" года";

    }
}
