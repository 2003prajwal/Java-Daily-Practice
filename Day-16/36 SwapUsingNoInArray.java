import java.util.Scanner;
 class SwapUsingNoInArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = input.nextInt();

        if (size <= 0) {
            System.out.println("Invalid array size!");
            return;
        }

        int A[] = new int[size];

        for (int i = 0; i < A.length; i++) {
            System.out.print("Enter array element " + (i + 1) + ": ");
            A[i] = input.nextInt();
        }

        System.out.println("Original Array:");
        for (int x : A) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int index1 = -1;
        int index2 = -1;

        for (int i=0; i<A.length; i++){
            if (A[i]==num1 && index1 == -1)
                index1 = i;
        }
        if (index1 == -1) {
            System.out.println("1st Number not found!");
            return;
        }
        for (int i=0; i<A.length; i++){
            if (A[i]==num2 && index2 == -1)
                index2=i;
        }

        if (index2 == -1) {
            System.out.println("2nd Number not found!");
            return;
        }

        int temp = A[index1];
        A[index1]=A[index2];
        A[index2]=temp;

        for (int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
    }
}
