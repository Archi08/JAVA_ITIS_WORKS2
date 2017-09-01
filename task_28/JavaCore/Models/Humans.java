package JavaCore.Models;

import JavaCore.Interfaces.Comparable;

/**
 * Created by tommy on 26.03.17.
 */
public class Humans implements Comparable<Humans> {
    private int id;
    private String name;
    private int age;



    public Humans(int id, String name, int age){
            try{
                if(id ==0 || age ==0 || name == ""){
                    throw new IllegalArgumentException("Ошибка!!!!! \n Не корректный аргумент у человека: "+id+","+name+","+age);
                }else{
                    this.id = id;
                    this.name = name;
                    this.age = age;
                }
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }


    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Humans{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Humans that) {
        return this.getAge()-that.getAge();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){return true;}
        if(obj == null || obj instanceof Humans){return false;}
        Humans that = (Humans)obj;
        if(this.id == that.id ||
                this.name.equals(that.name)||
                    this.age == that.age){
            return true;
        }else{
            return false;
        }
    }
}
