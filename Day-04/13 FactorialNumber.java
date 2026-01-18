import java.util.Scanner;

class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        long fact = fact(num);
        System.out.println(fact);
    }
    public static long fact(int num){
        if (num <= 1){
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i <= num){
            fact = fact*i;
            i++;
        }
        return fact;
    }
}