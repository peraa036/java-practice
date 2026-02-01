import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Unesi broj: ");
            int n = sc.nextInt();
            System.out.println(n);
        } catch (Exception e) {
            System.out.println("Pogresan unos!");
        } finally {
            System.out.println("'finally' se uvek izvrsava!");
        }
        sc.close();
    }
}
