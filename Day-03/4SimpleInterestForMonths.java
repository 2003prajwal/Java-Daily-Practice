import java.util.Scanner;

 class SimpleInterestForMonths {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter Your Principle Amount: ");
         double p = input.nextDouble();

         System.out.print("Enter Rate: ");
         double r = input.nextDouble();

         System.out.print("Enter Time in Months: ");
         int m = input.nextInt();
         int time = m/12;
         double SimpleInterestForMonths = (p*r*time)/100;
         System.out.println("Simple interest will be: "+SimpleInterestForMonths);
         input.close();
     }
 }
