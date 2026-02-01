package LinkedList;

import java.util.LinkedList;

public class LinkListExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("mango");

        System.out.println(fruits);

        fruits.add(2, "watermelon");
        System.out.println("After adding: " + fruits);

        fruits.addFirst("strawberry");
        System.out.println("After adding: " + fruits);

        fruits.addLast("orange");
        System.out.println("After adding: " + fruits);
    }
}
