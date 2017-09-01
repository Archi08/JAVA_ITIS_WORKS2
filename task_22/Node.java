package task_22;

/**
 * Created by Аюпов Аяз on 27.03.2017.
 */
public class Node {
    private Humans human;
    private Node next;
    private Node previous;

    public Node(Humans human) {
        this.human = human;
        next = null;
        previous = null;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public Humans getHuman() {
        return human;
    }
    public void setPrevious(Node previous){
        this.previous = previous;
    }
    public Node getPrevious(){return previous;}

    @Override
    public String toString() {

        return human.toString();
    }
}
