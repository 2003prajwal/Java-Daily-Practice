import java.util.Scanner;

class BankACc {
   private double balance;

  public void deposit(double amount){
       if (amount > 0)
        balance = balance + amount;
       else
           System.out.println("Insufficient Amount");
   }

   public double getBalance(){
       return balance;
   }
}

class SavingAC extends BankACc {

  public void addInterest(){
      double interest = getBalance()*5/100;
      deposit(interest);
      System.out.println("Interest Added: "+ interest);
    }
}
class BankAcSavingAc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SavingAC S = new SavingAC();

        System.out.print("Enter Deposit Money: ");
        S.deposit(input.nextDouble());

        S.addInterest();

        System.out.println("Final Balance: "+S.getBalance());


    }
}
