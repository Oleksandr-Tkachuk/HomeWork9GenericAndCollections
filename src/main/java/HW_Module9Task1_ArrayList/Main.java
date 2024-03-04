package HW_Module9Task1_ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add("Слава Україні");
        myList.add("Героям слава");
        myList.add("Слава нації");
        myList.add("Смерть ворогам");

        System.out.println("Розмір списку: " + myList.size());

        System.out.println("Отримуємо із списку: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        myList.remove(3);
        System.out.println("Розмір списку після видаленням елементу: " + myList.size());

        myList.clear();
        System.out.println("Розмір списку після очищення масиву: " + myList.size());
    }
}