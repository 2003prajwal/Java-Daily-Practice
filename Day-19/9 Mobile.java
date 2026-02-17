import java.util.Scanner;

class MobileRecharge{
    private long mobileNumber;
    private String customerName;
    private double balance;

    public void setMobileNumber(long M){
        mobileNumber = M;
    }

    public void setCustomerName(String N){
        customerName = N;
    }

    public void recharge(double amount){
        if(amount > 0) {
            balance = balance + amount;
            System.out.println("Recharge Successful");
        }
        else {
            System.out.println("Invalid Recharge Amount");
        }
    }
    public void makeCall(int min){
        double cost = min * 2;
        if (balance >= cost){
            balance = balance - cost;
            System.out.println("Call Successful");
        }
        else
            System.out.println("Insufficient Balance");
    }

    public double getBalance(){
        return balance;
    }
}

class Mobile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MobileRecharge M = new MobileRecharge();
        System.out.print("Enter Mobile Number: ");
        M.setMobileNumber(input.nextLong());

        System.out.print("Enter Customer Name: ");
        M.setCustomerName(input.next());

        System.out.print("Enter Recharge Amount: ");
        M.recharge(input.nextDouble());

        System.out.println("Per Min 2rs");
        System.out.print("Enter Call Minutes: ");
        M.makeCall(input.nextInt());

        System.out.print("Remaining Balance: "+M.getBalance());
    }
}
