import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class R13_FIO04_J {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("test.txt"));
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}