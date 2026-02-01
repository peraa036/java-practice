public class main {
    public static void main(String[] args) {
        greet();
        greetIme("Tamara!");
        greetIme("Petar!");

        int result = add(5, 3);
        System.out.println(result);
    }

    static void greet() {
        System.out.println("Zdravo!");
    }

    static void greetIme(String name) {
        System.out.println("Zdravo " + name);
    }

    static int add(int a, int b) {
        return a + b;
    }
}
