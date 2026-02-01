package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapUser {
    public static void main(String[] args) {
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, new Student("Pera" , "Peric"));
        studentMap.put(2, new Student("Mika" , "Mikic"));
        studentMap.put(3, new Student("Zika" , "Zikic"));

        System.out.println(studentMap.values());
    }
}
