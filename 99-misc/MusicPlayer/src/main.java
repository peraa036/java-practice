import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        ArrayList<String> songs = new ArrayList<>();
        songs.add("Pesma 1!");
        songs.add("Pesma 2!");
        songs.add("Pesma 3!");

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < songs.size(); i++) {
            System.out.println(i + ": " + songs.get(i));
        }
        System.out.println("Izaberi pesmu: ");
        int choice = sc.nextInt();

        if (choice >= 0 && choice < songs.size()) {
            System.out.println("Pusta se: " + songs.get(choice));
        } else {
            System.out.println("Pogresan izbor!");
        }
        sc.close();
    }
}
