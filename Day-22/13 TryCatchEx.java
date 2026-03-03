import java.util.Scanner;
 class TryCatchEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = input.nextInt();

        System.out.print("Enter Number 2: ");
        int num2 = input.nextInt();

        try {
            int division = num1/num2;
            System.out.println("Division is: "+division);
        }
        catch (ArithmeticException e){
            System.out.println("Cannot Divide By Zero");
        }
    }
}
