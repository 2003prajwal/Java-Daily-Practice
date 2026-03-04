import java.io.FileInputStream;
import java.util.Scanner;

class TryWithResources {
    static void divide() throws Exception{

        try (FileInputStream fi = new FileInputStream("C:\\Users\\prajw\\OneDrive\\Documents\\Desktop\\abc.txt");Scanner input = new Scanner(fi) )
        {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            System.out.println(a/c);
        }
    }

    public static void main(String[] args) {
        try {
            divide();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
