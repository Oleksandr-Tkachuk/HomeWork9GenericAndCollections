package HW_Module9Task3_Queue;

public class MyQueue {
    private Object[] queueArray;
    private int myFirstIn;
    private int myFirstOut;
    private int mySize;
    private static final int DEFAULT_CAPACITY = 10;

    public MyQueue() {
        queueArray = new Object[DEFAULT_CAPACITY];
        myFirstIn = 0;
        myFirstOut = -1;
        mySize = 0;
    }

    public void add(Object value) {
        if (mySize == queueArray.length) {
            throw new RuntimeException("Черга переповнена!");
        }
       if (myFirstOut == queueArray.length - 1) {
           myFirstOut = 0;
       } else {
           myFirstOut++;
       }

       queueArray[mySize] = value;
       mySize++;
    }

    public void clear() {
        myFirstIn = 0;
        myFirstOut = -1;
        mySize = 0;
    }

    public int size() {
        return mySize;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("Черга порожня!");
        }
        return queueArray[myFirstIn];
    }

    public Object poll() {
        if (isEmpty()) {
            throw new RuntimeException("Черга пуста!");
        }
        Object value = queueArray[myFirstIn];
        queueArray[myFirstIn] = null;
        mySize--;

        if (myFirstIn == queueArray.length - 1) {
            myFirstIn = 0;
        } else  {
            myFirstIn++;
        }
        return value;
    }

    public boolean isEmpty() {
        return mySize == 0;
    }
}
