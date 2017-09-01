package JavaCore;

import JavaCore.LinkedAndArrayList.ArrayList;
import JavaCore.Models.Humans;



/**
 * Created by tommy on 03.04.17.
 */
public class ArrayListMain {
    public static void main(String[] args) {
        Humans human1 = new Humans(6,"Аяз",25);
        Humans human2 = new Humans(8,"Рома",23);
        Humans human3 = new Humans(13,"Вася",20);
        Humans human4 = new Humans(7,"Коля",19);
        Humans human5 = new Humans(4,"Сирин",30);
        Humans human6 = new Humans(34,"Лева",27);
        ArrayList<Humans> arrayList= new ArrayList<Humans>();
        arrayList.addToBegin(human1);
        arrayList.addToEnd(human2);
        arrayList.addToBegin(human3);
        arrayList.addToIndex(human4,1);
        arrayList.addToEnd(human5);
        arrayList.remove(human4);
        arrayList.removeByIndex(3);
        arrayList.addToEnd(human6);
        arrayList.removeFirst();
        System.out.println(arrayList.getCount());
        System.out.println();
        arrayList.showArray();

    }
}
