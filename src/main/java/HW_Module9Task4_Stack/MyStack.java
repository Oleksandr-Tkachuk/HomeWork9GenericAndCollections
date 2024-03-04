package HW_Module9Task4_Stack;

public class MyStack {
    private Object[] myStackArray;
    private int top;

    public MyStack (int myCapacity) {
        myStackArray = new Object[myCapacity];
        top = -1;
    }

    public void push(Object value) {

        if (top == myStackArray.length - 1) {
            throw new RuntimeException("Мій стек переповнений!");
        }
        myStackArray[++top] = value;
    }

    public void remove(int index) {
        if (index < 0 || index > top) {
            throw new IndexOutOfBoundsException("Невірний індекс, мусить бути в межах стеку");
        }
        for (int i = index; i < top; i++) {
            myStackArray[i] = myStackArray[i + 1];
        }
        top--;
    }

    public void clear() {
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("Стек пустий!");
        }
        return myStackArray[top];
    }

    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("Стек пустий!");
        }
        return myStackArray[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
