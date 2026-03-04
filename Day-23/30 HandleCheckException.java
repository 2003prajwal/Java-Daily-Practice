import java.io.FileNotFoundException;
import java.io.FileReader;

class HandleCheckException {
    static void openFile()throws FileNotFoundException {
        FileReader file = new FileReader("abc.txt");
    }

    public static void main(String[] args) {
        try {
            openFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }
    }
}
