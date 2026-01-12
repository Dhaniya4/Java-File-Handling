import java.io.FileOutputStream;
public class WriteBdata {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("Bdata.dat")) {
            fos.write(72);
            fos.write(101);
            fos.write(108);
            fos.write(108);
            fos.write(111);
            System.out.println("Written successfully!");
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}