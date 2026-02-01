import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        String op = sc.next();
        double b = sc.nextDouble();

        switch (op){
            case "+" -> System.out.println(a+b);
            case "-" -> System.out.println(a-b);
            case "*" -> System.out.println(a*b);
            case "/" -> {
                if(b == 0){
                    System.out.println("Ne mozes deliti nulom!");
                } else {
                    System.out.println(a/b);
                }
            }
            default -> System.out.println("Unesite validnu operaciju!");
        }
    }
}
