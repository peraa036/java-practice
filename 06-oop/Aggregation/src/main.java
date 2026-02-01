public class main {
    public static void main(String[] args) {
        Student s = new Student("Petar");
        School school = new School(s);

        System.out.println(school.student.name);
    }
}
