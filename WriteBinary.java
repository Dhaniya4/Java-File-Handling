import java.io.FileOutputStream;
import java.io.IOException;
public class WriteBinary {
    public static void main(String[] args) {
        try{
            FileOutputStream file = new FileOutputStream("binary.txt",true);
            file.write(66);
            System.out.println("Contents written to file successfully!!");
            file.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
