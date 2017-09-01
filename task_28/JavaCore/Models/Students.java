package JavaCore.Models;

import JavaCore.Interfaces.Comparable;

/**
 * Created by tommy on 02.04.17.
 */
public class Students implements Comparable<Students>{
    private Humans student;
    private  int groupNumber;

    public Students(Humans student, int groupNumber) {
        try{
        if(groupNumber == 0){
            throw new IllegalArgumentException("Не может быть такой группы"+groupNumber);
        }else {
            this.student = student;
            this.groupNumber = groupNumber;
        }
        }catch(IllegalArgumentException e){
            System.out.println("Ошибка: "+e.getMessage());
        }
    }

    public Humans getStudent() {
        return student;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    @Override
    public String toString() {
        return "Students{" +
                "student=" + student +
                ", groupNumber=" + groupNumber +
                '}';
    }

    @Override
    public int compareTo(Students that) {
        return this.getGroupNumber()-that.getGroupNumber();
    }
}
