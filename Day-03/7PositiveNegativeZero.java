import java.util.Scanner;

class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your no: ");
        float num = input.nextInt();
        if (num < 0) System.out.println("Negative");
        else if (num==0) System.out.println("Zero");
        else System.out.println("Positive");
    }
}
