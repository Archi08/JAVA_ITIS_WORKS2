package task_22.LinkedList;

import task_22.Humans;
import task_22.Node;

/**
 * addToTail
 * remove
 * show
 * последний пришел, первый вышел
 * push - ложит в конец
 * pop - забирает с конца
 * peek - посмотреть на последний элемент который положили
 */
public class LinkedStack {
    private Node head;
    private Node tail;


    public LinkedStack() {
        this.head = null;
        this.tail = null;
    }
    public void push(Humans human){
        Node newNode = new Node(human);
        if(head==null){
            head = newNode;
            tail = newNode;
            return;
        }
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = tail.getNext();

    }
    private void remove(Humans human){
        if(head == tail){
            head = null;
            tail = null;
            return;
        }
        if(head.getHuman()==human){
            head = head.getNext();
        }else if(tail.getHuman() == human){
            tail.getPrevious().setNext(null);
            return;
        }

            Node current = head;
            while (current.getNext().getNext() != null) {
                if (current.getNext().getHuman() == human) {
                    current.setNext(current.getNext().getNext());
                    return;
                }
                current = current.getNext();
            }

    }
    public Humans pop(){
        Node last = tail;
        remove(tail.getHuman());
        tail = last.getPrevious();

        return last.getHuman();
    }
    public void showList(){
        Node current = head;
        if(head == null){
            System.out.println("==== Нечего показывать ====");
        }
        while(current!=null){
            System.out.println(current.toString());
            current = current.getNext();
        }

    }

}
