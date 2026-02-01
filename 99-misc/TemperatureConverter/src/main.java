import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //c -> f : f = c * 9 / 5 + 32
        //f -> c : c = (f - 32) * 5 / 9

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi temperaturu: ");
        double temp = sc.nextDouble();

        System.out.println("Unesi jedinicu (C/F): ");
        String units = sc.next().toUpperCase();

        if (units.equals("C")) {
            double f = temp * 9.0 / 5.0 + 32;
            System.out.printf("%.2f F = %.2f C%n", temp, f);
        } else if (units.equals("F")) {
            double c = (temp - 32) * 5.0 / 9.0;
            System.out.printf("%.2f C = %.2f F%n", temp, c);
        } else {
            System.out.println("Nepoznata jedinica.");
        }
        sc.close();
    }
}
