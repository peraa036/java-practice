import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vase ime: ");
        String ime = sc.nextLine();
        System.out.println(ime);

        System.out.println("Koliko imate godina: ");
        int age = sc.nextInt();
        System.out.println(age);

        System.out.println("Zdravo "+ ime + " imate " + age + " godina!");
    }
}
