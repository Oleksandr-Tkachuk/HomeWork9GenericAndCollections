package HW_Module9Task5_HashMap;

public class MyHashMap {
    private static final int DEFAULT_CAPACITY = 16;
    private Node[] myProject;
    private int mySize;

    public MyHashMap() {
        myProject = new Node[DEFAULT_CAPACITY];
        mySize = 0;
    }

    private int getMyIndex(int hash) {
        if (hash < 0) {
            return -hash;
        } else {
            return hash;
        }
    }

    private int hash(int hashCode) {
        if (hashCode < 0) {
            return -hashCode % myProject.length;
        } else {
            return hashCode % myProject.length;
        }
    }
    private static class Node {
        Object key;
        Object value;
        Node next;

        Node(Object key, Object value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public void put(Object key, Object value) {
        if (key == null)
            return;

        int myHash = hash(key.hashCode());
        int myIndex = getMyIndex(myHash);

        Node newNode = new Node(key, value, null);

        if (myProject[myIndex] == null) {
            myProject[myIndex] = newNode;
        } else {
            Node current = myProject[myIndex];
            while (current.next != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            current.next = newNode;
        }
        mySize++;
    }

    public void remove(Object key) {
        if (key == null)
            return;

        int myHash = hash(key.hashCode());
        int myIndex = getMyIndex(myHash);

        Node current = myProject[myIndex];
        Node prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    myProject[myIndex] = current.next;
                } else {
                    prev.next = current.next;
                }
                mySize--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public void clear() {
        myProject = new Node[DEFAULT_CAPACITY];
        mySize = 0;
    }

    public int size() {
        return mySize;
    }

    public Object get(Object key) {
        int myHash = hash(key.hashCode());
        int myIndex = getMyIndex(myHash);

        Node current = myProject[myIndex];
        while (current != null) {
            if (current.key.equals(key))
                return current.value;
            current = current.next;
        }
        return null;
    }
}
