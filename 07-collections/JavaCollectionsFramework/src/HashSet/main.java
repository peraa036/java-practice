package HashSet;

import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        nullValueDemo();
        duplicateValueDemo();
        unorderedDemo();
    }

    private static void nullValueDemo(){
        Set<String> set = new HashSet<>();
        set.add(null);
        set.add(null);
        System.out.println(set.toString());
    }

    private static void duplicateValueDemo(){
        Set<String> set = new HashSet<>();
        set.add("element1");
        set.add("element1");
        System.out.println(set.toString());
    }

    private static void unorderedDemo(){
        Set<String> set = new HashSet<>();
        set.add("element1");
        set.add("element2");
        set.add("element4");
        set.add("element5");
        set.add("element7");
        set.add("element6");
        System.out.println(set.toString());
    }
}
