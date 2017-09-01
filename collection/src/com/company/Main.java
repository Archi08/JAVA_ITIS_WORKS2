package com.company;

import com.company.list.ArrayList;
import com.company.list.LinkedList;
import com.company.list.List;
import com.company.models.Human;

import java.util.Iterator;


public class Main {

    public static void main(String[] args) {
	    Human human1 = new Human(0,"Ayaz",25);
        Human human2 = new Human(1,"Tommy",25);
        Human human3 = new Human(2,"Mark",25);
        Human human4 = new Human(3,"Alex",25);
        Human human5 = new Human(4,"Lil",25);
        List<Human> list = new LinkedList<>();
        list.add(human1);
        list.add(human2);
        list.add(human3);
        list.add(human4);
        list.addToIndex(3,human5);
        list.print();
        System.out.println("-----------");
        Iterator<Human> humans = list.iterator();
        while(humans.hasNext()){
            System.out.println(humans.next());
        }





    }
}
