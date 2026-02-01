import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Petar");
        names.add("Marko");
        names.add("Ana");

        names.remove(1);
        names.set(0, "Nikola");

        System.out.println(names);
        System.out.println(names.get(0));

        for (String n : names) {
            System.out.println(n);
        }
    }
}
