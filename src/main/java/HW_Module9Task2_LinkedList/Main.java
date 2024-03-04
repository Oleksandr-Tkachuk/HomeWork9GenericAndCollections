package HW_Module9Task2_LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();

        myList.add("Елемент 1");
        myList.add("Елемент 2");
        myList.add("Елемент 3");
        myList.add("Елемент 4");
        myList.add("Елемент 5");

        System.out.println("Розмір списку: " + myList.size());

        System.out.println("Елемент за індексом 4: " + myList.get(4));

        myList.remove(2);
        System.out.println("Розмір списку після видалення елементу: " + myList.size());

        myList.clear();
        System.out.println("Розмір списку після очищення: " + myList.size());
    }
}
