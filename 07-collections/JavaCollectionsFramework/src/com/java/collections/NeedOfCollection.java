package com.java.collections;

import java.util.List;

public class NeedOfCollection {
    public static void main(String[] args) {
        int[] arArray = new int[10000];
        // limitations of array
        //1. Arrays are fixed in size
        //2. Arrays can hold only homogeneous data elements

        Student[] students = new Student[10];
        students[0] = new Student();
        students[1] = new Student();

        Object[] objects = new Object[10];
        objects[0] = new Student();
        objects[1] = new Student();
        objects[2] = new Book();
        // 3. ready made APIs support is not available in array

    }

    static class Book {

    }

    static class Student {

    }

}
