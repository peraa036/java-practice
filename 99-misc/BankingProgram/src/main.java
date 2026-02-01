import java.util.Scanner;

public class main {

    static double balance = 1000;

    static void deposit(double amount) {
        balance += amount;
    }

    static void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Nedovoljno sredstava.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int odabir;

        while (true) {
            System.out.println("1. Balans");
            System.out.println("2. Depozit");
            System.out.println("3. Podignite novac");
            System.out.println("0. Izlaz");
            System.out.println("Unesite opciju: ");

            odabir = sc.nextInt();


            switch (odabir) {
                case 1 -> System.out.println("Stanje: " + balance);
                case 2 -> {
                    System.out.println("Unesite inzos za uplatu: ");
                    deposit(sc.nextDouble());
                    System.out.println("Stanje: " + balance);
                }
                case 3 -> {
                    System.out.println("Unesite koliko zelite da podignete: ");
                    withdraw(sc.nextDouble());
                    System.out.println("Stanje: " + balance);
                }
                case 0 -> {
                    System.out.println("Hvala sto koristite bankomat!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Odaberite jednu od datih opcija!");
            }
        }
    }
}