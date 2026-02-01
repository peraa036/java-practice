import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj: ");
        int broj = sc.nextInt();

        if(broj % 2 == 0){
            System.out.println("Broj " + broj + " je paran!") ;
        } else {
            System.out.println("Broj je neparan!");
        }
    }
}
