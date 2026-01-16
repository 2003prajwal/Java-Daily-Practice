import java.util.Scanner;
 class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principle Amount: ");
        float P = input.nextFloat();
        System.out.print("Enter Rate: ");
        float R = input.nextFloat();
        System.out.print("Enter Year: ");
        float Y = input.nextFloat();

        float SimpleInterest = (P*R*Y)/100;
        System.out.println("Your Interest Amount is: "+SimpleInterest);
        System.out.println("Your Principle Amount is: "+(P+SimpleInterest));

    }
}