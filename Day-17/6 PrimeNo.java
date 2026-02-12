import java.util.Scanner;

class PrimeNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();

        boolean ans = isPrime(num);
        if (ans) {
            System.out.println("Your number is Prime");
        }
        else {
            System.out.println("Your number is NOT Prime");
        }
    }
    static boolean isPrime(int num){
        if (num<=1)
            return false;

      for (int i=2; i<num; i++){
          if (num%i == 0)
              return false;
      }
      return true;
    }
}
