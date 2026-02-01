import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi broj: ");
        int broj = sc.nextInt();
        if(broj > 0){
            System.out.println("Pozitivan.");
        } else if(broj < 0){
            System.out.println("Negativan.");
        } else {
            System.out.println("Nula.");
        }
        sc.close();
    }
}
