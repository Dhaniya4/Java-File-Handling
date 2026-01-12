import java.io.File;
public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("Example.txt");
        if(file.delete()){
            System.out.println("Deleted : "+file.getName()+" successfully!");
        }
        else{
            System.out.println("File not found!!");
        }
    }
}
