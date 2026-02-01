import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> proizvodi = new ArrayList<>();
        ArrayList<Integer> kolicine = new ArrayList<>();
        ArrayList<Double> cene = new ArrayList<>();

        double ukupno = 0;

        while(true){
            System.out.println("Unesi proizvod: ");
            String proizvod = sc.nextLine();
            proizvodi.add(proizvod);

            System.out.println("Unesi kolicinu: ");
            int kolicina = Integer.parseInt(sc.nextLine());
            kolicine.add(kolicina);

            System.out.println("Unesi cenu: ");
            double cena = Double.parseDouble(sc.nextLine());
            cene.add(cena);

            double total = cena * kolicina;
            ukupno += total;

            System.out.println("Dodato: " + proizvod + " | " +
                    kolicina + " x " + cena + " = " + total);

            System.out.println("Da li ste zavrsili(da/ne): ");
            String odgovor = sc.nextLine().trim().toLowerCase();

            if(odgovor.equals("da")){
                break;
            }
        }
        System.out.println("\n---------RACUN----------");
        for(int i = 0; i < proizvodi.size(); i++){
            double stavka = kolicine.get(i) * cene.get(i);
            System.out.println((i + 1) + ". " + proizvodi.get(i) +
            " - " + kolicine.get(i) + " x " + cene.get(i) + " = " + stavka);
        }
        System.out.println("Ukupno : " + ukupno);

        sc.close();
    }
}
