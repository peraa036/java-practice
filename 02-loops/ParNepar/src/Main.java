import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi broj: ");
        int broj = sc.nextInt();
        if(broj % 2 == 0){
            System.out.println("Broj je paran");
        } else {
            System.out.println("Broj je neparan");
        }
    }
}