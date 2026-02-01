import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite prvi operand: ");
        double a = sc.nextDouble();

        System.out.println("Unesite operaciju: ");
        String op = sc.next();

        System.out.print("Unesite drugi operand: ");
        double b = sc.nextDouble();

        double res;

        switch (op) {
            case "+" -> res = a + b;
            case "-" -> res = a - b;
            case "*" -> res = a * b;
            case "/" -> {
                if (b == 0) {
                    System.out.println("Deljenje sa nulom nije dozvoljeno!");
                    sc.close();
                    return;
                } else {
                    res = a / b;
                }
            }
            default -> {
                System.out.println("Nepoznat operator!");
                sc.close();
                return;
            }
        }
        System.out.println("Rezultat: " + res);
        sc.close();
    }
}
