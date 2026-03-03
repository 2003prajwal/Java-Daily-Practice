import java.util.Scanner;

class TryCatch2 {
    public static void main(String[] args) {
        int A[] = {1, 2, 5, 6, 89, 0};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Index no: ");
        try {
            System.out.print("Enter index number: ");
            int index = input.nextInt();
            System.out.println("Value at index "+index+" is: "+A[index]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index position");
        }
    }
}
