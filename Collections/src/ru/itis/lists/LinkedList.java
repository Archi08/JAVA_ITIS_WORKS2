package ru.itis.lists;

import java.util.Iterator;

/**
 * 20.04.2017
 * LinkedList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class LinkedList<T> implements List<T> {

    private class Node {

        private T value;
        private Node next;
        public Node(T value) {
            this.value = value;
        }

    }

    // Итератор связного списка
    private class LinkedListIterator implements Iterator<T> {

        // итератор всегда помнит текущий узел, а если точнее, тот
        // который следует вернуть
        private Node current;

        public LinkedListIterator(Node current) {
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            // копируем значение из current
            T value = current.value;
            // current сдвигаем
            current = current.next;
            // возвращаем значение
            return value;
        }
    }

    private Node head;

    private Node last;
    private int count;

    public LinkedList() {
        this.count = 0;
        this.head = null;
        this.last = null;
    }

    @Override
    public void add(T element) {
        Node newNode = new Node(element);

        if (head == null) {
            head = newNode;
            last = newNode;
        } else {
            /*
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            */
            this.last.next = newNode;
            this.last = newNode;
        }
        count++;
    }

    @Override
    public void delete(T element) {
        Node current = this.head;
        Node previous = null;
        while (current != null) {
            if (current.value.equals(element)) {
                previous.next = current.next;
            }
                previous = current;
                current = current.next;

        }
        count--;
    }

    @Override
    public void removeByIndex(int index) {
        if (index < count && index >= 0) {
            Node current = this.head;
            Node previous = null;
            int i = 0;

            while (i < index) {
                previous = current;
                current = current.next;
                i++;
            }
            previous.next = current.next;
            count--;
        }
    }

    @Override
    public T get(int index) {
        if (index < count && index >= 0) {
            Node current = this.head;
            int i = 0;

            while (i < index) {
                current = current.next;
                i++;
            }

            return current.value;
        } throw new IndexOutOfBoundsException();
    }

    @Override
    public int indexOf(T element) {
        int index = 0;
        Node current = this.head;
        while (current != null) {
            if (current.value.equals(element)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public void addToBegin(T element) {
        Node newNode = new Node(element);
        Node oldHead = head;
        if (head == null) {
            head = newNode;
            last = newNode;
        } else {
            head = newNode;
            newNode.next = oldHead;
        }
        count++;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator(head);
    }

    @Override
    public int size() {
        return count;
    }


}
