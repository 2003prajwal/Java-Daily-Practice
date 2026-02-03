import java.util.Scanner;

class ArraySumAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = input.nextInt();
        int A[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter array element " + (i + 1) + ": ");
            A[i] = input.nextInt();
        }
        System.out.println();
        int sum = sumOfArray(A);
        System.out.println("Sum of array: "+sum);
        avgOfArray(sum, size);
    }

    public static int sumOfArray(int A[]) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
        }
        return sum;
    }
    public static void avgOfArray(int sum, int size){
        System.out.println("Average of array: "+(sum/size));
    }
}
