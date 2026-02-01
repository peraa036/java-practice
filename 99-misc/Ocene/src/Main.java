import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ocenu: ");
        int ocena = sc.nextInt();

            switch(ocena){
                case 1 -> System.out.println("Nedovoljan");
                case 2 -> System.out.println("Dovoljan");
                case 3 -> System.out.println("Dobar");
                case 4 -> System.out.println("Vrlodobar");
                case 5 -> System.out.println("Odlican");
                default -> System.out.println("Unesite ocenu(1-5)");
            }
        
    }
}