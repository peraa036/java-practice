import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(10);
        int b = r.nextInt(6) + 1;

        System.out.println(a);
        System.out.println(b);
    }
}