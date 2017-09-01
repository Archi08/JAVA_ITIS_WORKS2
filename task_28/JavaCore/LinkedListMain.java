package JavaCore;


import JavaCore.LinkedAndArrayList.LinkedList;
import JavaCore.Models.Triangle;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Triangle> linkedList = new LinkedList<Triangle>();
        Triangle tr = new Triangle(3,5,6);
        Triangle tr2 = new Triangle(2,4,3);
        Triangle tr3 = new Triangle(4,7,3);
        Triangle tr4 = new Triangle(2,5,3);
        try{
            linkedList.pop();}catch (Exception e){
            System.out.println("Нечего удалять!");
        }
        linkedList.push(tr);
        linkedList.push(tr2);
        linkedList.push(tr3);
        linkedList.push(tr4);
        System.out.println("Посмотрели последний элемент-"+ linkedList.peep());
        System.out.println();
        try{
            linkedList.pop();}catch (Exception e){
            System.out.println("Нечего удалять!");
        }
        linkedList.showList();

    }
}
