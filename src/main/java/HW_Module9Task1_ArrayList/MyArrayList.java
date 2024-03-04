package HW_Module9Task1_ArrayList;

public class MyArrayList {
    private Object[] myArray;
    private int sizeArray;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        myArray = new Object[DEFAULT_CAPACITY];
        sizeArray = 0;
    }

    public void add(Object value) {
        if (sizeArray == myArray.length) {
            throw new RuntimeException("Масив переповнений");
        }
        myArray[sizeArray++] = value;
    }

    public void remove(int index) {
        if (index < 0 || index >= sizeArray) {
            throw new IndexOutOfBoundsException("Індекс поза межами нашого масиву");
        }
        for (int i = index; i < sizeArray - 1; i++) {
            myArray[i] = myArray[i + 1];
        }
        myArray[sizeArray - 1] = null;
        sizeArray--;
    }

    public void clear() {
        for (int  i = 0; i < sizeArray; i++) {
            myArray[i] = null;
        }
        sizeArray = 0;
    }
    public int size() {
        return sizeArray;
    }

    public Object get(int index) {
        if (index < 0 || index >= sizeArray) {
            throw new IndexOutOfBoundsException("Індекс за межами масиву");
        }
        return myArray[index];
    }

}
