import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;
        int pitanje = 1;
        String odgovor = "";

        while (!odgovor.equalsIgnoreCase("exit")) {

            if (pitanje == 1) {
                System.out.println("Koliko je 2 + 2?");
                odgovor = sc.nextLine();

                if (odgovor == "4") {
                    System.out.println("Tacno!");
                    score++;
                } else if (!odgovor.equalsIgnoreCase("exit")) {
                    System.out.println("Netacno.");
                }
            } else if (pitanje == 2) {
                System.out.println("Koji je glavni grad Srbije?");
                odgovor = sc.nextLine();

                if (odgovor.equalsIgnoreCase("beograd")) {
                    System.out.println("Tacno!");
                    score++;
                } else if (!odgovor.equalsIgnoreCase("exit")) {
                    System.out.println("Netacno.");
                }
            } else if (pitanje == 3) {
                System.out.println("Koliko je 5 * 3?");
                odgovor = sc.nextLine();

                if (odgovor.equals("15")) {
                    System.out.println("Tacno!");
                    score++;
                } else if (!odgovor.equalsIgnoreCase("exit")) {
                    System.out.println("Netacno.");
                }
            } else {
                break;
            }

            pitanje++;
            System.out.println();
        }

        System.out.println("Kviz je zavrsen!");
        System.out.println("Tvoj rezultat: " + score);
        sc.close();
    }
}
