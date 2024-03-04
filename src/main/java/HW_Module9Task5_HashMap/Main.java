package HW_Module9Task5_HashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap myHashMap = new MyHashMap();

        System.out.println("Додаємо ключі із значеннями");
        myHashMap.put("Progect_1", "In_2012");
        myHashMap.put("Progect_2", "In_2014");
        myHashMap.put("Progect_3", "In_2015");

        System.out.println("Отримання значення першого проекту: ");
        System.out.println(myHashMap.get("Progect_1"));

        System.out.println("Видаляємо, наприклад другий проект");
        myHashMap.remove("Progect_2");

        System.out.println("Перевіряємо розмір після видалення: ");
        System.out.println(myHashMap.size());

        System.out.println("Виведення вмісту після очищення: ");
        myHashMap.clear();
        System.out.println(myHashMap.size());
    }
}
