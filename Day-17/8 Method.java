import java.util.Scanner;

class Method {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();

        System.out.println(isPositive(num));

    }
    public static boolean isPositive(int num) {
       return num>0;
    }
}
