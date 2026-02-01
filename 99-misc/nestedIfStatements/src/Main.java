//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 19;
        boolean hasId = true;

        if(age >= 18){
            if(hasId){
                System.out.println("Ulaz dozvoljen!");
            } else {
                System.out.println("Nemate ID");
            }
        } else {
            System.out.println("Nemate dovoljno godina!");
        }
    }
}