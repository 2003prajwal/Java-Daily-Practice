import java.util.Scanner;
class SimpleInterestMonthsOrYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle Amount: ");
        double p = input.nextDouble();

        System.out.print("Enter Rate: ");
        double r = input.nextDouble();

        System.out.println("Tell me calculate interest base on Year or Months");
        System.out.println("For Year Press 1");
        System.out.println("For Months Press 2");

        System.out.print("Enter Your Choice: ");
        int Choice = input.nextInt();
        float time;
        if (Choice == 1) {
            System.out.print("Enter Time in Year: ");
            time = input.nextInt();
        } else if (Choice == 2) {
            System.out.print("Enter Time in Months: ");
            float months = input.nextInt();
            time = months / 12;

        } else {
            System.out.println("Invalid Input");
            return;
        }
        double SI = (p*r*time)/100;
        System.out.println("Your Interest Will be: "+SI);
        double TotalAmount = p+SI;
        System.out.println("Total Amount Will be: "+TotalAmount);
        input.close();
    }
}