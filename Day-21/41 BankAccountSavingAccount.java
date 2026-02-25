import java.util.Scanner;

class AcBank{
     long accountNo;
     double balance;

    AcBank(long accountNo, double balance){
        this.accountNo=accountNo;
        this.balance=balance;
    }
}
class  SavingAccount extends  AcBank{
    double interestRate;

    SavingAccount(long accountNo, double balance, double interestRate){
        super(accountNo,balance);
        this.interestRate=interestRate;
    }

    public void calculateYearlyInterest(){

        double interest = (balance * interestRate)/100;
        balance = balance + interest;

        System.out.println("Interest: "+interest);
        System.out.println("With Interest Balance: "+balance);
    }
}
class BankAccountSavingAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Balance: ");
        double balance = input.nextDouble();

        System.out.print("Tell me Interest Rate: ");
        double interestRate = input.nextDouble();
        SavingAccount SA = new SavingAccount(4345, balance, interestRate);
        SA.calculateYearlyInterest();
    }
}
