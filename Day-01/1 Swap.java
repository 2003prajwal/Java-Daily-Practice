import java.util.Scanner;
class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = input.nextInt();
        System.out.print("Enter B: ");
        int b = input.nextInt();
        System.out.print("Enter C: ");
        int c = input.nextInt();

        int d = a;
        a = b;
        b = c;
        c = d;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}