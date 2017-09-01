package task_22.LinkedQueue;
import task_22.Humans;
import task_22.Node;
/*
* очередь на основе связных списков
* FIFO
* enqueue - встать в очередь
* dequeue -
* */
public class LinkedQueue {
    private Node head;
    private Node tail;

    public LinkedQueue(){
        head = null;
        tail = null;
    }
    public void enqueue(Humans human){
        Node newNode = new Node(human);
        if(head == null ){
            head = newNode;
            tail = newNode;
            return;
        }
        Node tmp = head;
        head = newNode;
        newNode.setNext(tmp);
        tmp.setPrevious(newNode);
    }
    private void remove(Humans human){
        if(head==tail && human == head.getHuman()){
            head =null;
            tail =null;
            return;
        }else if(head.getHuman()==human){
            head = head.getNext();
            head.setPrevious(null);
            return;
        }else if(tail.getHuman() == human){
//           tail.getPrevious().setNext(null);
            tail = tail.getPrevious();
            tail.setNext(null);
            return;
        }
        Node current = tail;
        while(current.getPrevious().getPrevious()!=null){
            if(current.getPrevious().getHuman() == human){
                current.setPrevious(current.getPrevious().getPrevious());
                return;
            }
            current = current.getPrevious();
        }


    }
    public Humans dequeue(){

            Node last = tail;
            remove(tail.getHuman());
            return last.getHuman();

    }
    public void showQueue(){
        if(tail==null){
            System.out.println("===Очередь пуста===");
            return;
        }
        Node current = tail;
        while(current!=null){
            System.out.println(current.getHuman());
            current = current.getPrevious();
        }
    }
}
