import java.io.FileWriter;
public class AppendFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Example.txt",true);
            writer.write("This is appended line!!");
            System.out.println("Contents have been appended successfully!!");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}
