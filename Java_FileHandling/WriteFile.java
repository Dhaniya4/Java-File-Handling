import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("Example.txt");
            writer.write("Hello world!");
            writer.close();
            System.out.println("successfully wrote to the file");
        }catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
