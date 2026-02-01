import java.util.ArrayList;

public class main {
    static <T> void print (T value){
        System.out.println(value);
    }
    public static void main(String[] args) {
        print("Hello");
        print(123);
        print(3.14);
    }
}
