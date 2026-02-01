import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int max = a;
        if(max < b){
            max = b;
            System.out.println(b + " je maksimalna vrednost!");
        } else if (max < c){
            max = c;
            System.out.println(c + " je maksimalna vrednost!");
        } else {
            System.out.println(a + " je maksimalna vrednost!");
        }
        sc.close();
    }
}
