import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi rec: ");
        String rec = sc.nextLine();
        String sam = "AEIOUaeiou";
        int brojac = 0;
        for(int i = 0; i < rec.length(); i++){

            char c = rec.charAt(i);

            if(sam.indexOf(c)!= -1){
                brojac++;
            }
        }
        System.out.println("Samoglasnika: " + brojac);
        sc.close();


    }
}
