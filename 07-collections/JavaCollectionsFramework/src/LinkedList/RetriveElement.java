package LinkedList;

import java.util.LinkedList;

public class RetriveElement {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("pineapple");

        String firstElement = fruits.getFirst();
        System.out.println("First element: " + firstElement);

        String lastElement = fruits.getLast();
        System.out.println("Last element: " + lastElement);

        String elemet = fruits.get(1);
        System.out.println("Second element from list: " + elemet);

        System.out.println("All elements: ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
