import java.util.Scanner;

class Pattern1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        for (int i=1; i<=num; i++){
            for (int j=1; j<=num; j++){
                System.out.print(i+j);
            }
            System.out.println();
        }
    }
}