import java.util.Scanner;

class SumEvenOdd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many number you want to enter: ");
        int n = input.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i <= n; i++){
            System.out.print("Enter no "+i+": ");
            int num = input.nextInt();
            if (num %2==0){
                evenSum = evenSum+num;
            }else
                oddSum = oddSum+num;
        }
        System.out.println("Even Sum: "+evenSum);
        System.out.println("Odd Sum: "+oddSum);
    }
}