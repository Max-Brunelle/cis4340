import java.io.File;

public class R02_XP00_J {
    public void deleteFile() {
        File someFile = new File("someFileName.txt");
        // Do something with someFile
        if (!someFile.delete()) {
            System.out.println("Failed to delete file.");
        }
    }

    public static void main(String[] args) {
        R02_XP00_J example = new R02_XP00_J();
        example.deleteFile();
    }
}