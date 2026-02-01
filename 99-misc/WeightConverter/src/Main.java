import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1kg = 2.20462 lbs
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi tezinu u kilogramima: ");
        double kg = sc.nextDouble();

        double lbs = kg * 2.20462;

        System.out.printf("%.2f kg = %.2f lbs%n", kg, lbs);

    }
}