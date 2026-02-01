import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi rec: ");
        String rec = sc.nextLine();

        String obrnuto = new StringBuilder(rec).reverse().toString();

        if(rec.equals(obrnuto)){
            System.out.println("Palindrom");
        } else {
            System.out.println("Nije palindrom");
        }
    }
}
