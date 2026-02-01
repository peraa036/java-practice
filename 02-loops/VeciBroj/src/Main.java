import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi prvi broj: ");
        int a = sc.nextInt();
        System.out.println("Unesi drugi broj: ");
        int b = sc.nextInt();

        if(a > b){
            System.out.println("Prvi broj " + a + " je veci!");
        } else if (a < b) {
            System.out.println("Drugi broj " + b + " je veci!");
        } else {
            System.out.println("Jednaki su!");
        }
    }
}