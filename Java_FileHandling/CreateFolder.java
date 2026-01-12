import java.io.File;
public class CreateFolder {
    public static void main(String[] args) {
        File directory = new File("Directory");
        if(directory.mkdir()){
            System.out.println(directory.getName()+" is created successfully!!");
        }
        else{
            System.out.println("Folder with same name already exists!");
        }
    }
}
