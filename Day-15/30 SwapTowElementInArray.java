import java.util.Scanner;

class SwapTowElementInArray {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 5, 6, 4, 6,};
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");

        }
        Scanner input = new Scanner(System.in);
        System.out.println();

        System.out.print("Enter number that you want to swap: ");
        int num = input.nextInt();

        System.out.print("Enter another number that you want to swap: ");
        int num2 = input.nextInt();

        int c=0;
        for (int i=0; i<A.length; i++){
            if (A[i]==num) {
                c= A[i];
                A[i]=num2;

            }
            else if (A[i]==num2){
                A[i]=c;
            }
        }


        for (int x:A){
            System.out.print(x+" ");
        }
    }

}