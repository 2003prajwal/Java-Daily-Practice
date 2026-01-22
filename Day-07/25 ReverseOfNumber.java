import java.util.Scanner;

class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        long num = input.nextLong();
        while (num > 0){
            long lastDigit = num %10;
            System.out.print(lastDigit);
            num = num/10;

        }
    }
}
