//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String email = "peckie.kv.98@gmail.com";

        int atIndex = email.indexOf("@");
        String username = email.substring(0,atIndex);
        String domain = email.substring(atIndex + 1);

        System.out.println(username);
        System.out.println(domain);
    }
}