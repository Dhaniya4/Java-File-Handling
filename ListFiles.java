import java.io.File;
public class ListFiles {
    public static void main(String[] args) {
        File directory = new File("Directory");
        if(directory.isDirectory() == true){
            String[]files = directory.list();
            for(String string : files){
                System.out.println(string);
            }
        }
        else{
            System.out.println("Folder not found.");
        }
    }
}
