package itterations;

import java.util.*;

public class SortList {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10, "Pera", 27, 4000));
        employees.add(new Employee(20, "Mika", 26, 3000));
        employees.add(new Employee(30, "Zika", 25, 3000));
        employees.add(new Employee(40, "Janko", 24, 2000));

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.getName().compareTo(o1.getName()));
            }
        });
        Collections.sort(employees,(o1, o2)
                -> (o1.getName().compareTo((o2.getName()))));

        System.out.println(employees);
    }

    class MySort implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (o2.getSalary() - o1.getSalary());
        }
    }
}