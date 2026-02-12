import java.util.Scanner;

class ReverseIntOrArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int size = input.nextInt();
        int A[]=new int[size];
        for (int i=0; i<A.length; i++){
            System.out.print("Enter Array Element "+(i+1)+": ");
            A[i]= input.nextInt();
        }
        reverse(A);
        System.out.println();

        System.out.print("Enter number that you want to reverse: ");
        int num = input.nextInt();
        reverse(num);
    }
    public static void reverse(int A[]){
        for (int i=A.length-1; i>=0; i--){
            System.out.print(A[i]+" ");
        }
    }
    public static void reverse(int num){
        while (num > 0) {
            int reverseNo = num % 10;
            System.out.print(reverseNo);
            num = num/10;
        }
    }
}
