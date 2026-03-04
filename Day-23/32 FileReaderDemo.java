import java.io.FileNotFoundException;
import java.io.FileReader;

class FileReaderDemo {
    public static void readFile()throws FileNotFoundException {
        FileReader file = new FileReader("abc.tx");
    }
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
