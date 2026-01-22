import java.util.Scanner;
class WhileLoop3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int i = 1;
        while (i<=num){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
    }
}
