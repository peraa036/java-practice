package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class SearchIteration {
    public static void main(String[] args) {
        LinkedList<String> progLangs = new LinkedList<>();

        progLangs.add("C");
        progLangs.add("C++");
        progLangs.add("Core Java");
        progLangs.add("Java EE");
        progLangs.add("Spring Framework");
        progLangs.add("Hibernate Framework");

        boolean result = progLangs.contains("C");
        System.out.println("result = "+ result);

        int index = progLangs.indexOf("Core Java");
        System.out.println("index = " + index);

        int lastIndex = progLangs.lastIndexOf("Spring Framework");
        System.out.println("lastIndex = " + lastIndex);

        System.out.println();
        Iterator<String> iterator = progLangs.iterator();
        while (iterator.hasNext()){
            String prog = (String) iterator.next();
            System.out.println(prog);
        }

        System.out.println();
        progLangs.forEach((element) -> {
            System.out.println(element);
        });

        System.out.println();
        for(String e : progLangs){
            System.out.println(e);
        }
    }
}
