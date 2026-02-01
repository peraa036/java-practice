import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
    Scanner sc = new Scanner(System.in);

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    public void getLogin() throws IOException {
        int x = 1;
        do {
            try {
                data.put(952141, 191904);
                data.put(989947, 71974);

                System.out.println("Welcome to the ATM Project!");
                System.out.println("Enter your customer number: ");
                setCustomerNumber(menuInput.nextInt());

                System.out.println("Enter your PIN: ");
                setPinNumber(menuInput.nextInt());
            } catch (Exception e) {
                System.out.println("\n" + "Invalid Character(s). Only numbers." + "\n");
                x = 2;
            }

            int cn = getCustomerNumber();
            int pn = getPinNumber();
            if (data.containsKey(cn) && data.get(cn) == pn) {
                getAccountType();
            } else {
                System.out.println("\n" + "Wrong Customer Number or Pin Number" + "\n");
            }
        } while (x == 1);
    }
    public void getAccountType(){
        System.out.println("Select the Account you want to access: ");
        System.out.println("1. Check account");
        System.out.println("2. Saving account");
        System.out.println("3. Exit");

        int selection = menuInput.nextInt();

        switch(selection){
            case 1 -> getChecking();
            case 2 -> getSaving();
            case 3 -> System.out.println("Thank ypu for using this ATM! \n");
            default -> System.out.println("\n Invalid Choice! \n");
        }
    }
}
