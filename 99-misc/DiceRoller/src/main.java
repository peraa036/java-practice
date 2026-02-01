import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Koliko bacanja: ");
        int rolls = sc.nextInt();

        for (int i = 1; i <= rolls; i++) {
            int dice = r.nextInt(6) + 1;
            System.out.println("Bacanje: " + i + ": " + dice);
        }
        sc.close();
    }
}
