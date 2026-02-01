public class main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task());
        Thread t2 = new Thread(new Task());
        Thread t3 = new Thread(new Task());

        t1.start();
        t2.start();
        t3.start();
    }
}
