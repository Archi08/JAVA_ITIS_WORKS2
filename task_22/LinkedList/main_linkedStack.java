package task_22.LinkedList;

import task_22.Humans;

/**
 * Created by Аюпов Аяз on 27.03.2017.
 */
public class main_linkedStack {
    public static void main(String[] args) {
        LinkedStack linkedList = new LinkedStack();
        Humans human1 = new Humans("Аяз",1,1,1992);
        Humans human2 = new Humans("Марина",31,3,1993);
        Humans human3 = new Humans("Влада",28,7,1994);
        Humans human4= new Humans("Ольга",25,3,1995);
        Humans human5= new Humans("Даша",14,4,1996);
        Humans human6 = new Humans("Каша",17,12,1997);
        linkedList.push(human1);
        linkedList.push(human2);
        linkedList.push(human3);
        linkedList.push(human4);
        linkedList.push(human5);
        linkedList.push(human6);
        linkedList.showList();

        System.out.println();
        System.out.println( "Вырезано-"+linkedList.pop()+"!!!!");
        linkedList.showList();

        System.out.println();
        System.out.println("Вторая итерация");
        System.out.println("Вырезано -"+ linkedList.pop());
        linkedList.showList();

        System.out.println();
        System.out.println( "Вырезано-"+linkedList.pop()+"!!!!");
        linkedList.showList();
        System.out.println();
        System.out.println( "Вырезано-"+linkedList.pop()+"!!!!");
        linkedList.showList();
        System.out.println();
        System.out.println( "Вырезано-"+linkedList.pop()+"!!!!");
        linkedList.showList();

        System.out.println( "Вырезано-"+linkedList.pop()+"!!!!");
        linkedList.showList();



    }
}
