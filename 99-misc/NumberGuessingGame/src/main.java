import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int secret = r.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        while (guess != secret) {
            System.out.println("Pogodi broj od 1-100: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < secret) {
                System.out.println("Broj je veci!");
            } else if (guess > secret) {
                System.out.println("Broj je manji!");
            } else {
                System.out.println("Pogodak!");
                System.out.println("Broj pokusaja: " + attempts);
            }
        }
        sc.close();
    }
}
