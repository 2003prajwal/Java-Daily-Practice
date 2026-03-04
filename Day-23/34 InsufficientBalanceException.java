import java.util.Scanner;

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String msg){
        super(msg);
    }
    static double balance = 1000;
    public static void withdraw(double withdrawMoney)throws InsufficientBalanceException{
        if (balance < withdrawMoney){
            throw new InsufficientBalanceException("Low Balance");
        }
        else {
            balance = balance -withdrawMoney;

            System.out.println("Withdraw Successfully");
            System.out.println("Your Remaining Balance is: "+balance);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Withdraw Amount: ");
        double amount = input.nextDouble();
        try {
            withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
