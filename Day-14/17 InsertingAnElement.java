import java.util.Scanner;

class InsertingAnElement {
    public static void main(String[] args) {
        int A[] = new int[15];
        A[0] = 1;
        A[1] = 32;
        A[2] = 1;
        A[3] = 4;
        A[4] = 5;
        A[5] = 10;
        int n = 6;

        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter index no:");
        int index = input.nextInt();

        System.out.print("Enter number that you want to insert in array at " + index + " no:");
        int num = input.nextInt();

        for (int i = n; i > index; i--) {
            A[i] = A[i - 1];

        }
        A[index] = num;
        for (int i = 0; i <= n; i++) {
            System.out.print(A[i] + " ");

        }
    }
}

