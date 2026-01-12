import java.io.FileInputStream;
public class ReadBinary {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("Bdata.dat");
            int n;
            while ((n = file.read()) != -1) {
                System.out.print("\nByte: " + n + " Char: " + (char)n);
            }
            System.out.println("\n");
            file.close();
            System.out.print("Read data is: ");
            FileInputStream file2 = new FileInputStream("Bdata.dat");
            while ((n = file2.read()) != -1) {
                System.out.print((char)n);
            }
            file2.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}