import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite dan: ");
        String day = sc.next().toUpperCase();

        String type = switch (day) {
            case "SAT", "SUN" -> "Vikend!";
            case "MON", "TUE", "WED", "THU", "FRY" -> "Radni dan.";
            default -> "nepoznato";
        };
        System.out.println(type);
    }
}
