import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("data.txt");
            writer.write("Zdravo fajl\n");
            writer.write("Java upis");
            writer.close();
        }catch (IOException e){
            System.out.println("greska pri upisu...");
        }
    }
}
