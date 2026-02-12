import java.util.Scanner;

class BankAccount{
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public long getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(long a){
        accountNumber = a;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public void setAccountHolderName(String n){
        accountHolderName = n;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double b){
        if (b>=0)
         balance = b;
        else
            balance = 0;
    }

    public void deposit(double amount){
        if (amount>0){
            balance = balance+amount;
            System.out.println("Deposit Successful");
        }
        else
            System.out.println("Invalid deposit amount");
    }

    public void withdraw(double amount){
        if (amount <= 0){
            System.out.println("Invalid withdrawal amount");
        }
        else if (amount > balance) {
            System.out.println("Insufficient Balance");
        }
        else {
            balance = balance-amount;
            System.out.println("Withdrawal Successful");
        }
    }

}
class Encapsulation2 {
    public static void main(String[] args) {
        BankAccount B = new BankAccount();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Account Number: ");
        B.setAccountNumber(input.nextLong());

        System.out.print("Enter Account Holder Name: ");
        B.setAccountHolderName(input.next());

        System.out.print("Initial Balance: ");
        B.setBalance(input.nextDouble());

        System.out.print("Deposit: ");
        B.deposit(input.nextDouble());

        System.out.print("Withdraw: ");
        B.withdraw(input.nextDouble());

        System.out.println("Final Balance: "+B.getBalance());
    }
}
