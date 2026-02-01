public class main {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student("Ana");
        students[1] = new Student("Marko");
        students[2] = new Student("Petar");

        for(Student s : students){
            System.out.println(s.name);
        }
    }
}
