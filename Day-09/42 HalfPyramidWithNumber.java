import java.util.Scanner;

class HalfPyramidWithNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
       // num=num+1;
        for (int i=1; i<=num;i++){
            for (int j =1; j<=num-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
