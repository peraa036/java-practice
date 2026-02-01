import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi prvi sabirak: ");
        double a = sc.nextDouble();
        System.out.println("Unesi drugi sabirak: ");
        double b = sc.nextDouble();

        System.out.println("Zbir je: " + (a+b));
        sc.close();
    }
}