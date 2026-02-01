import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ticket? ");
        String ticketConf = sc.next().toLowerCase();
        System.out.println("Age? ");
        int age = sc.nextInt();
        sc.nextLine();


        if (age >= 18 && ticketConf.equals("yes")) {
            System.out.println("Pass!");
        } else if (age >= 18 && ticketConf.equals("no")) {
            System.out.println("No pass!");
        } else if (ticketConf.equals("no")) {
            System.out.println("No pass!");
        } else {
            System.out.println("Something...");
        }
    }
}
