package JavaCore.LinkedAndArrayList;

/**
 * Created by Аюпов Аяз on 27.03.2017.
 */
public class Node<V> {
    private V value;
    private Node next;
    private Node previous;

    public Node(V value) {
        this.value = value;
        next = null;
        previous = null;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public V getValue() {
        return this.value;
    }
    public void setPrevious(Node previous){
        this.previous = previous;
    }
    public Node getPrevious(){return previous;}

    @Override
    public String toString() {

        return value.toString();
    }
}
