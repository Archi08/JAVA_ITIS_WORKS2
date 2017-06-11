package ru.itis.main.models;

/**
 * 27.04.2017
 * Auto
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Auto implements Model {

    private int id;
    private boolean used;
    private String model;
    private int mileage;


    public Auto(int id, String model, int mileage, boolean used) {
        this.id = id;
        this.model = model;
        this.mileage = mileage;
        this.used = used;
    }

    public Auto( String model, int mileage, int idOwner, boolean used) {
        this.model = model;
        this.mileage = mileage;
        this.used = used;

    }


    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }



    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setModel(String model) {
        this.model = model;
    }



    public int getMileage() {
        return mileage;
    }

    public String getModel() {
        return model;
    }

}
