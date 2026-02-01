import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = "";
        double price;
        int quantity;
        double total;
        int counter = 0;
        System.out.println("What would you like to buy: ");
        product = sc.nextLine();

        System.out.println("What is the price of the product? ");
        price = sc.nextDouble();

        System.out.println("The quantity of product: ");
        quantity = sc.nextInt();

        System.out.println("Product: " + product);
        System.out.println("Price: " + price);
        total = price * quantity;
        System.out.println("Your total is $" + total);
    }
}