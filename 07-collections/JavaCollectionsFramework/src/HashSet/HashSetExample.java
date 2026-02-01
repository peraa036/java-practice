package HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> programminngLangs = new HashSet<>();
        programminngLangs.add("C");
        programminngLangs.add("C++");
        programminngLangs.add("Java");
        programminngLangs.add("Python");
        programminngLangs.add("Java Script");

        System.out.println(programminngLangs);
        programminngLangs.add("Java");
        System.out.println(programminngLangs);
    }
}
