package task_22.LinkedQueue;

import task_22.Humans;

/**
 * Created by Аюпов Аяз on 28.03.2017.
 */
public class mainQueue {
    public static void main(String[] args) {
        Humans human1 = new Humans("Аяз",1,1,1992);
        Humans human2 = new Humans("Марина",31,3,1993);
        Humans human3 = new Humans("Влада",28,7,1994);
        Humans human4= new Humans("Ольга",25,3,1995);
        Humans human5= new Humans("Даша",14,4,1996);
        Humans human6 = new Humans("Каша",17,12,1997);
        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.enqueue(human1);
        linkedQueue.enqueue(human2);
        linkedQueue.enqueue(human3);
        linkedQueue.enqueue(human4);
        linkedQueue.enqueue(human5);
        linkedQueue.enqueue(human6);
        linkedQueue.showQueue();
        System.out.println();
        System.out.println("Первый в очереди - "+linkedQueue.dequeue());
        System.out.println("Второй в очереди - "+linkedQueue.dequeue());
        System.out.println("Третий в очереди - "+linkedQueue.dequeue());
        System.out.println("Четвертый в очереди - "+linkedQueue.dequeue());
        System.out.println("Пятый в очереди - "+linkedQueue.dequeue());
        System.out.println("Шестой в очереди - "+linkedQueue.dequeue());
        linkedQueue.showQueue();

    }
}
