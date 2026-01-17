import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principle Amount: ");
        float P = input.nextFloat();
        System.out.println("Enter Rate: ");
        float R = input.nextFloat();

        System.out.println("Choose Interest base in Months and Years");
        System.out.println("For Months Press 1");
        System.out.println("For Years Press 2");

        float time;
        int choice = input.nextInt();
        if (choice == 2){
            System.out.print("Enter time in Years: ");
            time = input.nextFloat();
        } else if (choice == 1) {
            System.out.println("Enter time in Months: ");
            float months = input.nextInt();
            time = months/12;
        }
        else {
            System.out.println("Invalid Data");
            return;
        }
        double amount = P*Math.pow((1+R/100),time);
        double CI = amount-P;
        System.out.println("Your Compound Interest: "+CI);
        System.out.println("Your Total Amount Will Be:"+amount);
    }
}
