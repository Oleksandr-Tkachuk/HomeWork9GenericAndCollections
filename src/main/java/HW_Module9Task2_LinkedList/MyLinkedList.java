package HW_Module9Task2_LinkedList;

import org.w3c.dom.Node;

public class MyLinkedList {
    private Node myStart;
    private Node myFinish;
    private int mySize;

    private static class Node {
        Object myData;
        Node myNext;
        Node myLast;

        Node(Object myData) {
            this.myData = myData;
        }
    }

    public MyLinkedList() {
        mySize = 0;
    }

    public void add(Object value) {
        Node newNode = new Node(value);
        if (mySize == 0) {
            myStart = newNode;
            myFinish = newNode;
        } else {
            myFinish.myNext = newNode;
            newNode.myLast = myFinish;
            myFinish = newNode;
        }
        mySize++;
    }
    public void remove(int index) {
        if (index < 0 || index >= mySize) {
            throw new IndexOutOfBoundsException("Індекс за межами списку!");
        }

        Node current = myStart;
        for (int i = 0; i < index; i++) {
            current = current.myNext;
        }

        if (current.myLast == null) {
            myStart = current.myNext;
        } else {
            current.myLast.myNext = current.myNext;
        }

        if (current.myNext == null) {
            myFinish = current.myLast;
        } else {
            current.myNext.myLast = current.myLast;
        }

        mySize--;
    }
    public void clear() {
        myStart = null;
        myFinish = null;
        mySize = 0;
    }

    public int size() {
        return mySize;
    }

    public Object get(int index) {
        if (index < 0 || index >= mySize) {
            throw new IndexOutOfBoundsException("Індекс за межами списку!");
        }

        Node current = myStart;
        for (int i = 0; i < index; i++) {
            current = current.myNext;
        }

        return current.myData;
    }
}
