import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String[] choices = {"kamen", "papir", "makaze"};

        System.out.println("Izaberi(kamen, papir, makaze): ");
        String user = sc.next().toLowerCase();

        String cpu = choices[r.nextInt(3)];
        System.out.println("Racunar je izabrao: " + cpu);

        if (user.equals(cpu)) {
            System.out.println("Nereseno.");
        } else if (
                (user.equals("kamen") && cpu.equals("makaze")) ||
                        (user.equals("papir") && cpu.equals("kamen")) ||
                        (user.equals("makaze") && cpu.equals("papir"))
        ) {
            System.out.println("Pobedio si!");
        } else {
            System.out.println("izgubio si.");
        }
        sc.close();
    }
}
