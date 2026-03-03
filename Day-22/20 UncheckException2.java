import java.util.Scanner;

class UncheckException2 {
    void withdraw(double balance, double amount){
        if (amount > balance)
            throw new ArithmeticException("Insufficient Balance");
        else
            System.out.println("Withdrawal Successful");
    }
     public static void main(String[] args) {
         UncheckException2 U = new UncheckException2();
         Scanner input = new Scanner(System.in);
         System.out.print("Enter Balance: ");
         double b = input.nextDouble();
         System.out.print("Enter Amount: ");
         double a = input.nextDouble();
           try {
               U.withdraw(b,a);
           }
         catch (ArithmeticException e) {
             System.out.println(e);
         }
     }
}
