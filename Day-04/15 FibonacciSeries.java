import java.util.Scanner;

class FibonacciSeries{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        isFibonacci(num);

    }
    public static void isFibonacci(int num){
        if (num<0)return;
        int sum=0;
        System.out.println(0);
        sum=sum+0;
        if (num == 0) {
            System.out.println("Addition of fibonacci numbers: " + sum);
            return;
        }
        System.out.println(1);
        sum = sum+1;
        int first=0, second=1;
        while (first+second <= num){
            int third = first+second;
            first=second;
            second=third;

            System.out.println(third);
            sum= sum+third;
        }
        System.out.println();
        System.out.println("Addition of fibonacci series: "+sum);
    }
}