import java.io.File;
import java.io.IOException;
public class CreateFile{
    public static void main(String[] args) {
        try {
            File file = new File("filecreation.txt");
            if (file.createNewFile()) {
                System.out.println("file created successfully "+file.getName()+" ");
            } else {
                System.out.println("file already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}