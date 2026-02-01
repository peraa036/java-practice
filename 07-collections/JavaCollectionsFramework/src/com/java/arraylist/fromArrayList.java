package com.java.arraylist;

import java.util.ArrayList;
import java.util.List;

public class fromArrayList {
    public static void main(String[] args) {
        List<String> topProgrammingLanguages = new ArrayList<>();

        System.out.println("Is the topProgrammingLanguages list is empty? \n" +
                topProgrammingLanguages.isEmpty());

        topProgrammingLanguages.add("C");
        topProgrammingLanguages.add("Java");
        topProgrammingLanguages.add("C++");
        topProgrammingLanguages.add("Python");
        topProgrammingLanguages.add(".net");

        System.out.println("Here are the top " + topProgrammingLanguages.size()
        + " programming languages in the world!");

        String bestProgrammingLang = topProgrammingLanguages.get(1);
        System.out.println("The best programming language is " + bestProgrammingLang);

        String scndBestProgrammingLang = topProgrammingLanguages.get(3);
        System.out.println("Second best programming language is " + scndBestProgrammingLang);

        topProgrammingLanguages.set(4, "C#");
        System.out.println(topProgrammingLanguages);

    }
}
