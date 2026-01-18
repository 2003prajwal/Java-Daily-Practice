import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your NO:");
        int num = input.nextInt();
        boolean ans = isPrime(num);
        if (ans){
            System.out.println("Your number is prime number");
        }else {
            System.out.println("Your number is not prime number");
        }

    }
    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        int i = 2;
        while (i < num){
            if (num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
