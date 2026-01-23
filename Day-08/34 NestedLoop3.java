import java.util.Scanner;

class NestedLoop3 {
    public static void main (String [] args){
        System.out.print("Enter number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 1; i<=num;i++){
            for (int number = 1; number <=i; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
