public class main {
    public static void main(String[] args) {
        Greeting g = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Zdravo!");
            }
        };
        g.sayHello();
    }
}
