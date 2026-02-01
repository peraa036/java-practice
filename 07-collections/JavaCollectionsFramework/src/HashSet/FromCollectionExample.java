package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FromCollectionExample {
    public static void main(String[] args) {
        //Set<Integer> firstFiveEvenNumbers = new HashSet<>();
        List<Integer> firstFiveEvenNumbers = new ArrayList<>();
        firstFiveEvenNumbers.add(2);
        firstFiveEvenNumbers.add(4);
        firstFiveEvenNumbers.add(6);
        firstFiveEvenNumbers.add(8);
        firstFiveEvenNumbers.add(10);

        // Set<Integer> tenEvenNumbers = new HashSet<>(firstFiveEvenNumbers);
        List<Integer> tenEvenNumbers = new ArrayList<>(firstFiveEvenNumbers);
        System.out.println(tenEvenNumbers);

        //Set<Integer> nextFiveEvenNumbers = new HashSet<>();
        List<Integer> nextFiveEvenNumbers = new ArrayList<>();
        nextFiveEvenNumbers.add(12);
        nextFiveEvenNumbers.add(14);
        nextFiveEvenNumbers.add(16);
        nextFiveEvenNumbers.add(18);
        nextFiveEvenNumbers.add(20);

        tenEvenNumbers.addAll(nextFiveEvenNumbers);
        System.out.println(tenEvenNumbers);
    }
}
