package ArrayList;

/**
 * Created by Аюпов Аяз on 15.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.addToEnd(1);
        arrayList.addToEnd(21);
        arrayList.addToEnd(13);
        arrayList.addToEnd(15);
        arrayList.addToEnd(12);
        arrayList.addToEnd(112);
        arrayList.addToEnd(13);
        arrayList.addToBegin(77);
        arrayList.addToEnd(34);
        arrayList.addToIndex(45,3);
        arrayList.showArray();
        arrayList.removeFirst();
        arrayList.removeLast();
        arrayList.addToEnd(45);
        arrayList.showArray();
        arrayList.removeByIndex(9);
        arrayList.showArray();
        arrayList.remove(112);
        arrayList.showArray();
        arrayList.reverse();
        arrayList.showArray();

    }
}
