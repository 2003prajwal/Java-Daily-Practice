import java.util.Scanner;

class FinallyPracticeEx1 {
    static void division() throws RuntimeException{
        Scanner input = new Scanner(System.in);
        System.out.print("Numerator: ");
        int numerator = input.nextInt();
        System.out.print("Denominator: ");
        int denominator = input.nextInt();
        try {
            System.out.println(numerator / denominator);
        }
        catch (RuntimeException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Thank You using the calculator");
        }
        System.out.println("Program Continue.....");
    }
    public static void main(String[] args) {
        division();
    }
}