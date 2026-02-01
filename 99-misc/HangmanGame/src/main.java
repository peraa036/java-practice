import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String secret = "java";
        String guessed = "";
        int attempts = 6;

        Scanner sc = new Scanner(System.in);

        while(attempts > 0){
            boolean allGuessed = true;

            for(int i = 0; i < secret.length(); i++){
                char c = secret.charAt(i);

                if(guessed.indexOf(c) >= 0){
                    System.out.print(c + " ");
                } else {
                    System.out.print("_ ");
                    allGuessed = false;
                }
            }
            System.out.println();
            if(allGuessed){
                System.out.println("Pogodak!");
                break;
            }

            System.out.print("Unesi slovo: ");
            char guess = sc.next().charAt(0);

            if(secret.indexOf(guess) < 0){
                attempts--;
                System.out.println("Pogresno. Preostalo pokusaja: " + attempts);
            } else {
                guessed += guess;
            }
        }
        sc.close();
    }
}
