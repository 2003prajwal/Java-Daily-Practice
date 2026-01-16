import java.util.Scanner;
class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A:");
        int A = input.nextInt();
        System.out.print("Enter B:");
        int B = input.nextInt();
        int C = A;
        A = B;
        B = C;

        System.out.println("After Swapping:");
        System.out.println("A = "+A);
        System.out.println("B = "+B);
    }
}