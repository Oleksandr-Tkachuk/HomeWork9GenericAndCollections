package HW_Module9Task3_Queue;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();


        myQueue.add("First element");
        myQueue.add("Second element");
        myQueue.add("Third element");

        System.out.println("Розмір черги: " + myQueue.size());

        Object firstElement = myQueue.poll();
        System.out.println("Отримую та видаляю перший елемент з черги: " + firstElement);

        System.out.println("Розмір черги після видалення: " + myQueue.size());

        Object peekElement = myQueue.peek();
        System.out.println("Після попереднього видалення, отримую перший елемент з черги без видалення: " + peekElement);

        myQueue.clear();
        System.out.println("Очищаю чергу!");
        System.out.println("Розмір черги після очищення: " + myQueue.size());


    }
}
