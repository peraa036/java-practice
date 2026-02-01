import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj za tablicu mnozenja: ");
        int broj = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(broj + " x " + i + " = " + (broj * i));
        }
        sc.close();
    }
}