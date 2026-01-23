import java.util.Scanner;
class NestedLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        for (int line = 1; line<=num;line++){
            for (int j = 1;j<=line;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
