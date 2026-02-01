package HashMap;

import java.util.*;

public class CreateHashMap {
    public static void main(String[] args) {
        Map<String, Integer> numberMapping = new HashMap<>();
        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);
        numberMapping.put("Four", 4);
        numberMapping.put("Five", 5);

        numberMapping.put(null, 6);

        System.out.println(numberMapping);

        System.out.println(numberMapping.isEmpty());

        System.out.println(numberMapping.size());

        if(numberMapping.containsKey("Four")){
            System.out.println("Exist");
        } else {
            System.out.println("Do not exist");
        }

        if(numberMapping.containsValue(4)){
            System.out.println("Exist");
        } else {
            System.out.println("Do not exist");
        }

        Integer v1 = numberMapping.get("One");
        System.out.println(v1);

        numberMapping.remove("One");
        System.out.println(numberMapping);

        Set<String> keys = numberMapping.keySet();
        System.out.println(keys);

        Collection<Integer> values = numberMapping.values();
        System.out.println(values);

        //Iterate:

        for(Map.Entry<String, Integer> entry : numberMapping.entrySet()){
            System.out.println("key -> " + entry.getKey()
            + " - " + "value -> " + entry.getValue());
        }

        System.out.println();

        Set<Map.Entry<String, Integer>> entries = numberMapping.entrySet();

        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key -> " + entry.getKey() + " "
            + "Value -> " + entry.getValue());
        }

        System.out.println();

        numberMapping.forEach((K, V) -> {
            System.out.print("K " + K + " ");
            System.out.print("V " + V + " ");
        });
    }
}
