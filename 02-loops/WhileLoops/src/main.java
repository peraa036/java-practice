import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        while (true) {
            System.out.println("Unesite broj od 1 do 10: ");
            number = sc.nextInt();

            if (number >= 1 && number <= 10) {
                break;
            }
            System.out.println("Pogresan unos!");
        }
        System.out.println("Unet broj: " + number);
        sc.close();
    }
}
