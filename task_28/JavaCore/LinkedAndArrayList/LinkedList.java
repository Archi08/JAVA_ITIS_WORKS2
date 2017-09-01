package JavaCore.LinkedAndArrayList;

/**
 * addToTail
 * remove
 * show
 * последний пришел, первый вышел
 * push - ложит в конец
 * pop - забирает с конца
 * peek - посмотреть на последний элемент который положили
 */
public class LinkedList<V>{
    private Node head;
    private Node tail;


    public LinkedList() {
        this.head = null;
        this.tail = null;
    }
    public void addToTell(V element){
        push(element);
    }
    public void push(V element){
        Node newNode = new Node(element);
        if(head==null){
            head = newNode;
            tail = newNode;
            return;
        }
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = tail.getNext();

    }
    private void remove(Object e){
        V element = (V)e;
        if(head == tail && head.getValue() == element){
            head = null;
            tail = null;
            return;
        }
        if(head.getValue()==element){
            head = head.getNext();
        }else if(tail.getValue() == element){
            tail.getPrevious().setNext(null);
            return;
        }

            Node current = head;
            while (current.getNext().getNext() != null) {
                if (current.getNext().getValue() == element) {
                    current.setNext(current.getNext().getNext());
                    return;
                }
                current = current.getNext();
            }

    }
    public V peep() {
        return (V)tail.getValue();
    }
    public V pop() throws Exception{
                Node last = tail;
                Object tmp = null;
                tmp = tail.getValue();
                remove(tmp);
                tail = last.getPrevious();
                return (V) last.getValue();
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
