import java.util.Scanner;
 class NestedLoop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        for (int line = 1; line <=num; line++){
            for (int star = num;star>=line;star--){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
