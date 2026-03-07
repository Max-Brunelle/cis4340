import java.io.DataInputStream;
import java.io.IOException;

public class R03_NUM03_J {
    public static int getInteger(DataInputStream is) throws IOException {
        return is.readInt();
    }

    public static void main(String[] args) {
        System.out.println("R03_NUM03_J noncompliant example");
    }
}