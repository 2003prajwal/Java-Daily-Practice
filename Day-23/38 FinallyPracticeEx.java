import java.util.Scanner;

class FinallyPracticeEx {
    static void division() throws RuntimeException{
        Scanner input = new Scanner(System.in);
        System.out.print("Numerator: ");
        int numerator = input.nextInt();
        System.out.print("Denominator: ");
        int denominator = input.nextInt();
        try {
            System.out.println(numerator / denominator);
        }
        finally{
            System.out.println("Thank You using the calculator");
        }
        System.out.println("Program not continue because you not handle exception in same method");
    }
    public static void main(String[] args) {
        try {
            division();
        }
        catch (RuntimeException e){
            System.out.println(e);
        }
    }
}