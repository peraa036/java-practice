package com.java.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsArrayList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("pineapple");
        fruits.add("grape");

        System.out.println(fruits);

        fruits.remove(4);

        System.out.println("After removing element with index 4: \n" + fruits);

        fruits.remove("mango");

        System.out.println("After removing 'mango': \n" + fruits);

        List<String> subFruits = new ArrayList<>();
        subFruits.add("banana");
        subFruits.add("apple");

        fruits.removeAll(subFruits);
        System.out.println(fruits);

        fruits.clear();
        System.out.println(fruits);
    }
}
