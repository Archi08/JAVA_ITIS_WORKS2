package ru.itis;

import ru.itis.lists.ArrayList;
import ru.itis.lists.LinkedList;
import ru.itis.lists.List;
import ru.itis.models.Human;

import java.util.Iterator;

public  class Main {


    public static void main(String[] args) {
	    List<Human> humanLinkedList =
                new LinkedList<>();

        List<Human> humanArrayList =
                new ArrayList<>();

        Human marsel = new Human(1, "Marsel", 23);
        Human farid = new Human(2, "Farid", 28);
        Human marat = new Human(3, "Marat", 24);
        Human ayvar = new Human(4, "Ayvar", 24);
        Human victoriya = new Human(5, "Victoriya", 22);

        humanArrayList.add(marsel);
        humanArrayList.add(farid);
        humanArrayList.add(marat);
        humanArrayList.add(ayvar);


        for (Human aHumanArrayList : humanArrayList) {
            System.out.println(aHumanArrayList);
        }


    }
}
