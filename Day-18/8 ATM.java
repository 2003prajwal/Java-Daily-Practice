import java.util.Scanner;

class SmallATM{
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public long getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(long ac){
        accountNumber = ac;
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
        if (b >= 0)
            balance = b;
        else
            balance = 0;
    }

    public void deposit(double amount){
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Successful Deposit");
        }

        else {
            System.out.println("Invalid Deposit");
        }
    }
    public void withdraw(double amount){
        if (amount <=0){
            System.out.println("Amount must be greater than 0");
        }
       else if (amount <= balance){
            balance = balance-amount;
            System.out.println("Withdraw Successful");
        }
       else
            System.out.println("Insufficient Balance");
    }

}
class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SmallATM bank = new SmallATM();

        System.out.print("Enter Account Number: ");
        bank.setAccountNumber(input.nextLong());

        System.out.print("Enter Account Holder Name: ");
        bank.setAccountHolderName(input.next());

        System.out.print("Enter Initial Balance: ");
        bank.setBalance(input.nextDouble());

        boolean running = true;

        while (running){
            System.out.println("=== Banking Menu ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int Choice = input.nextInt();

            switch (Choice){

                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = input.nextDouble();
                    bank.deposit(depositAmount);
                    break;

                case 2:
                    System.out.println("Enter Withdraw Amount: ");
                    double withdrawAmount = input.nextDouble();
                    bank.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println("Current Balance: " + bank.getBalance());
                    break;

                case 4:
                    running = false;
                    System.out.println("Thank you for using our banking system.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

    }
}
