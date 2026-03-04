import java.io.FileNotFoundException;
import java.io.FileReader;

// In this code fill file is not found code give runtime error
class CheckedUsingThrows {
    public static void main(String[] args)throws FileNotFoundException {
        FileReader file = new FileReader("abc.txt");
        System.out.println("File open successfully");
    }
}
