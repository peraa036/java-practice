//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String text = "    Java Programming    ";

        System.out.println(text.length());
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.trim());
        System.out.println(text.contains("Java"));
        System.out.println(text.startsWith("    J"));
        System.out.println(text.endsWith("    "));
        System.out.println(text.charAt(5));
        System.out.println(text.indexOf("g"));

    }
}