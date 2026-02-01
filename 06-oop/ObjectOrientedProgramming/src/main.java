public class main {
    public static void main(String[] args) {
        Student john =
                new Student("John", 25, "23 East, California");

        System.out.println(john.getName());
        System.out.println(john.getAge());
        System.out.println(john.getAddress());

    }
}
