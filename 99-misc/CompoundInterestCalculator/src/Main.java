import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //A = P * (1 + r / n)^(n * t)
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi pocetni ulog: ");
        double P = sc.nextDouble();

        System.out.print("Unesi godisnju kamatu: ");
        double r = sc.nextDouble();

        System.out.print("Unesi broj obracuna godisnje: ");
        int n = sc.nextInt();

        System.out.print("Unesi broj godina: ");
        int t = sc.nextInt();

        double A = P * Math.pow(1 + (r / n), n * t);

        System.out.printf("Konacni iznos: %.2f%n", A);

        sc.close();
    }
}