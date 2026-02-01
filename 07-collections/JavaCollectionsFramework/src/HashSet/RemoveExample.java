package HashSet;

import java.util.HashSet;
import java.util.Set;

public class RemoveExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        boolean result = numbers.remove(1);
        System.out.println("After remove(): " + result);
        System.out.println(numbers);

        Set<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        evenNumbers.add(8);
        evenNumbers.add(10);

        numbers.removeAll(evenNumbers);
        System.out.println(numbers);

        numbers.clear();
        System.out.println(numbers);
    }
}
