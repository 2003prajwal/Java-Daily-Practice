import java.util.Scanner;

public class SumOfOddNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your no:");
        int num = input.nextInt();
        int OddSum = oddSum(num);
        System.out.println(OddSum);
    }
    public static int oddSum(int num){
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum = sum + i;
            i = i + 2;
        }
        return sum;
    }
}
