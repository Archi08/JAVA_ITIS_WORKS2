public class ArrayList {
    private final int MAX_ARRAY_SIZE = 10;

    private int count;
    private int elements[];

    public ArrayList() {
        count = 0;
        elements = new int[MAX_ARRAY_SIZE];
    }

    public void addToEnd(int element) {
        addByIndex(element, count);
    }

    public void addToBegin(int element) {
        addByIndex(element, 0);
    }

    public void addByIndex(int element, int index) {
        if (count < MAX_ARRAY_SIZE) {
            for (int i = count; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            count++;
        } else {
            System.out.println("ArrayList is full");
        }
    }

    public void show() {
        for (int i = 0; i < count; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public void reverse() {
        for (int i = 0; i < count / 2; i++) {
            int temp = elements[i];
            elements[i] = elements[count - 1 - i];
            elements[count - 1 - i] = temp;
        }
    }

    public int getCount() {
        return count;
    }

    public void removeByIndex(int index) {
        if (count != 0) {
          for (int i = index; i < count - 1; i++) {
            elements[i] = elements[i + 1];
          }
          elements[count - 1] = 0;
          count--;
        } else {
          System.out.println("ArrayList is empty");
        }
    }

    public void removeLast() {
      removeByIndex(count - 1);
    }

    public void removeFirst() {
      removeByIndex(0);
    }

    public void remove(int element) {
      for (int i = 0; i < elements.length; i++) {
        if (element == elements[i]) {
          removeByIndex(i);
        }
      }
      System.out.println("element not found");
    }
}
