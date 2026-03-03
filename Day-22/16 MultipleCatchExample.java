import java.util.Scanner;

class MultipleCatchExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int[] arr = new int[2];
            System.out.println("Enter 1st no: ");
            arr[0]=Integer.parseInt(input.nextLine());

            System.out.println("Enter 2nd no: ");
            arr[1]=Integer.parseInt(input.nextLine());

            int result = arr[0]/arr[1];
            System.out.println("Division is: "+result);
        }
        catch (ArithmeticException e){
            System.out.println("Cannot Divide By Zero");
        }

        catch (NumberFormatException e){
            System.out.println("Please inter valid numeric values");
        }

        System.out.println("After Handling Exception Remaining code still working here");
    }
}
