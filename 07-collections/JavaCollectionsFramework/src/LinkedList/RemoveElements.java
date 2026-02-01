package LinkedList;

import java.util.LinkedList;

public class RemoveElements {
    public static void main(String[] args) {
        LinkedList<String> fruitList = new LinkedList<>();
        fruitList.add("banana");
        fruitList.add("apple");
        fruitList.add("mango");
        fruitList.add("pineapple");

        System.out.println("Initial LinkedList: " + fruitList);

        String element = fruitList.removeFirst();
        System.out.println("After removing first element: " + fruitList);

        fruitList.removeLast();
        System.out.println("After removing last element: " + fruitList);

        fruitList.remove("apple");
        System.out.println("After removing initial element: " + fruitList);

        fruitList.clear();
        System.out.println("Clean LIST!" + fruitList);
    }
}
