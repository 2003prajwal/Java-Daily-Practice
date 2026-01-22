import java.util.Scanner;
class CountDigitsOfNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int count = 0;
        if (num ==0) {
            count = 1;
        }
else {
            while (num > 0) {
                num = num / 10;
                count++;
            }
        }
            System.out.println("Digit in your number is: " + count);

    }
}
