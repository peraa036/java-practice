public class main {
    public static void main(String[] args) {
        User u1 = new User("petar");
        User u2 = new User("petar", 27);

        System.out.println(u1.username + " " + u1.age);
        System.out.println(u1.username + " " + u2.age);
    }
}
