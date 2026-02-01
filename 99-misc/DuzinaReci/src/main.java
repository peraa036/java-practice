import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi rec: ");
        String rec = sc.nextLine();
        if(rec.length() > 5){
            System.out.println("Rec ima vise od 5 slova!");
        } else if(rec.length() < 5){
            System.out.println("Rec ima manje od 5 slova!");
        } else {
            System.out.println("Rec ima 5 slova!");
        }
        sc.close();
    }
}
