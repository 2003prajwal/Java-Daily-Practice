import java.util.Scanner;

class UnchecksExceptionPractice {
    private int ac;
    private double balance;

    UnchecksExceptionPractice(int ac, double balance) {
        this.ac = ac;
        this.balance = balance;
    }
    void deposit(double amount){
        if (amount<=0) {
            throw new IllegalArgumentException("Amount is must be grater than zero");
        }
            balance=balance+amount;
        System.out.println("Deposited: "+amount);
    }
    void withdraw(double amount){
        if (amount<=0) {
            throw new IllegalArgumentException("Amount is must be grater than 0");
        }
        if (amount > balance){
            throw new IllegalStateException("Low Balance");
        }
        else
            balance = balance-amount;
        System.out.println("Withdraw: "+amount);
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Account No: ");
        int ac = input.nextInt();

        System.out.print("Enter Your Balance: ");
        double balance = input.nextDouble();
        UnchecksExceptionPractice u = new UnchecksExceptionPractice(ac,balance);

        System.out.print("Enter Your Deposit Amount: ");
        double dAmount = input.nextDouble();
        try {
            u.deposit(dAmount);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }


        System.out.print("Enter Your Withdraw Amount: ");
        double wAmount = input.nextDouble();
        try {
            u.withdraw(wAmount);
        }
        catch (IllegalArgumentException | IllegalStateException e){
            System.out.println(e);
        }

        System.out.println("Your Balance is: "+u.getBalance());
    }
}