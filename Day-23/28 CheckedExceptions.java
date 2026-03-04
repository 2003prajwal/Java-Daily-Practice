import java.io.FileNotFoundException;
import java.io.FileReader;

class CheckedExceptions {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("af.txt");
            System.out.println("File opened successfully");
        }
        catch (FileNotFoundException e){
            System.out.println("File not found!");
            System.out.println(e);
        }
    }
}

