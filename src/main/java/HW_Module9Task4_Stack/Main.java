package HW_Module9Task4_Stack;

public class Main {
    public static void main(String[] args) {

    MyStack myStack = new MyStack(10);

        System.out.println("Додаємо елементи до стеку!");
        myStack.push("First");
        myStack.push("Second");
        myStack.push("Third");

        System.out.println("Отримуємо елемент: " + myStack.peek());

        System.out.println("Значення видаленого елемента: " + myStack.pop());

        System.out.println("Розмір стеку: " + myStack.size());

        System.out.println("Видаляємо елемент за індексом, наприклад: 0 ");
        myStack.remove(0);

        System.out.println("Розмір стека після видалення: " + myStack.size());

        System.out.println("Очищаємо стек");
        myStack.clear();

        System.out.println("Розмір стека після очищення: " + myStack.size());

    }
}
