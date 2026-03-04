import java.io.FileInputStream;
import java.util.Scanner;

class ResourcesDemo {
    static FileInputStream fi;
    static Scanner input;
    static void Divide() throws Exception {
        fi = new FileInputStream("C:\\Users\\prajw\\OneDrive\\Documents\\Desktop\\abc.txt");

        try {
            input = new Scanner(fi);
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            System.out.println(a / c);
        }
        finally {
            fi.close();
            input.close();
        }
    }

    public static void main(String[] args) {
        try {
            Divide();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // We cannot access it because resource is close in finally block
        // If resource is not close you definitely access it
        int d = input.nextInt();
        System.out.println(d);
    }
}
