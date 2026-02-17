import java.util.Scanner;

class BankAc{
    private long acNo;
    private String acHolderName;
    private double balance;

    BankAc (){
        acNo = 4;
        acHolderName="Prajwal";
        balance = 000;
    }
    BankAc(long AcNo, String acHolderName, double balance){
        this.acNo =AcNo;
        this.acHolderName=acHolderName;
        this.balance=balance;
    }

    public void deposit(double amount){
        if (amount>0){
            balance=balance+amount;
            System.out.println("Deposit Successful. New Balance: " + balance);

        }
        else
            System.out.println("Money Must Be Greater Zero");
    }

    public void withdraw(double withdrawAmount){
        if (balance>= withdrawAmount){
            balance = balance-withdrawAmount;
            System.out.println("Withdraw Successful. New Balance: " + balance);

        }
        else
            System.out.println("Insufficient Balance");
    }
    public void display(){
        System.out.println("Account No: "+ acNo);
        System.out.println("Account Holder Name: "+acHolderName);
        System.out.println("Current Balance: "+balance);
    }
}
class BankAcManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAc B = new BankAc(258063532,"Prajwal Shinde",434);
        B.display();

        System.out.print("Enter deposit amount: ");
        B.deposit(input.nextDouble());

        System.out.print("Enter Withdraw amount: ");
        B.withdraw(input.nextDouble());

        System.out.println();
        B.display();

        System.out.println();
        System.out.println("Default Constructor ");
        BankAc b =new  BankAc();
        b.display();
    }
}
