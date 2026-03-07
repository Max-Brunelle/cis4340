import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;

public class R15_SEC01_J {
    private void privilegedMethod(final String filename) throws FileNotFoundException {
        try {
            FileInputStream fis =
                (FileInputStream) AccessController.doPrivileged(
                    new PrivilegedExceptionAction<Object>() {
                        public FileInputStream run() throws FileNotFoundException {
                            return new FileInputStream(filename);
                        }
                    }
                );
            fis.close();
        } catch (PrivilegedActionException e) {
            System.out.println("Privileged action failed");
        } catch (Exception e) {
            System.out.println("General error");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        R15_SEC01_J example = new R15_SEC01_J();
        example.privilegedMethod("test.txt");
    }
}
