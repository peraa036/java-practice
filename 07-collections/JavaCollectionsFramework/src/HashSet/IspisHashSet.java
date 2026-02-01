package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IspisHashSet {
    public static void main(String[] args) {
        Set<String> courses = new HashSet<>();
        courses.add("Java");
        courses.add("C");
        courses.add("C++");
        courses.add("Python");
        courses.add("Scala");

        System.out.println("Enchanced for loop ispis: ");
        for (String course : courses) {
            System.out.println(course);
        }

        System.out.println("Iterator ispis: ");
        for (Iterator<String> iterator = courses.iterator(); iterator.hasNext(); ) {
            String course = (String) iterator.next();
            System.out.println(course);
        }

        System.out.println("While loop ispis: ");
        Iterator<String> iterator = courses.iterator();
        while (iterator.hasNext()) {
            String course = (String) iterator.next();
            System.out.println(course);
        }

        System.out.println("lambda ispis: ");
        courses.forEach(course -> System.out.println(course));

        System.out.println("ForEach ispis: ");
        courses.stream().filter(course -> !"Java".equals(course))
                .forEach(course -> System.out.println(course));

    }
}
