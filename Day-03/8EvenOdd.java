import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your NO:");
        int Num = input.nextInt();
        if (Num%2==0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
