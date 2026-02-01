import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();

        ages.put("Petar", 27);
        ages.put("Marko", 30);

        System.out.println(ages.get("Petar"));

        if (ages.containsKey("Petar")) {
            System.out.println("Postoji!");
        }

        for (String key : ages.keySet()) {
            System.out.println(key + " -> " + ages.get(key));
        }
    }
}
