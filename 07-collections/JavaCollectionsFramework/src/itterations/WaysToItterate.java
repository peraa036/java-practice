package itterations;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WaysToItterate {
    public static void main(String[] args) {
        List<String> courses = Arrays.asList("C", "C++", "Java", "Spring", "Hibernate");

        //for loop
        for(int i = 0; i < courses.size(); i++){
            System.out.println(courses.get(i));
        }

        System.out.println();
        //enchanced for each loop
        for(String course : courses){
            System.out.println(course);
        }

        System.out.println();
        //basic loop with iterator
        for(Iterator iterator = courses.iterator(); iterator.hasNext();){
            String course = (String) iterator.next();
            System.out.println(course);
        }

        System.out.println();
        //iterator with while loop
        Iterator iterator = courses.iterator();
        while(iterator.hasNext()){
            String course = (String) iterator.next();
            System.out.println(course);
        }

        System.out.println();
        //java 8 stream + lambda example
        courses.stream().forEach(course -> System.out.println(course));

        System.out.println();
        //java 8 forEach + lamda
        courses.forEach((course) ->System.out.println(course));


    }
}
