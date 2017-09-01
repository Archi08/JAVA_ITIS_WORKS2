package BucketSort;

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
    private int count;

    public int getCount() {
        return count;
    }

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
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
            count++;
    }
    private void remove(Object e){
        V element = (V)e;
        if(head == tail && head.getValue() == element){
            head = null;
            tail = null;
            count--;
            return;
        }
        if(head.getValue()==element){
            head = head.getNext();
            count--;
            return;
        }else if(tail.getValue() == element){
            tail.getPrevious().setNext(null);
            count--;
            return;
        }
            Node current = head;
            while (current.getNext().getNext() != null) {
                if (current.getNext().getValue() == element) {
                    current.setNext(current.getNext().getNext());
                    count--;
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
    public void reverse(){
//        Node current_head = head;
//        Node current_tail = tail;
//        for(int i=0;i<count;i++){
//            Node tmp = current_head;
//            current_head = current_tail;
//            current_head.setNext(current_tail.getPrevious());
//            if(current_head!=tail) {
//                current_head.setPrevious(current_tail.getNext());
//            }
//            current_tail = tmp;
//            if(current_tail !=head){
//            current_tail.setNext(tmp.getPrevious());
//            }
//            current_tail.setPrevious(tmp.getNext());
//            current_head = current_head.getNext();
//            current_tail = current_tail.getPrevious();
//        }
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
    public void addList(LinkedList<V> list){
        if(this.head !=null){
       this.tail.setNext(list.head);
       this.tail = list.tail;
        }else{
            this.head = list.head;
            this.tail = list.tail;
        }
    }

}
