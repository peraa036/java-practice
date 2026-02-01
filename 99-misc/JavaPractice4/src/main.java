import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi imenicu: ");
        String imenica = sc.nextLine();

        System.out.println("Unesi glagol: ");
        String glagol = sc.nextLine();

        System.out.println("Unesi pridev: ");
        String pridev = sc.nextLine();

        System.out.println("Danas sam video " + pridev + " " + imenica + " kako " + glagol + ".");
        sc.close();
    }
}
