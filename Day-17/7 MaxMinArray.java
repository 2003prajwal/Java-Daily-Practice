import java.util.Scanner;
class MaxMinArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = input.nextInt();

        int A[]= new int[size];
        for (int i=0; i<A.length; i++){
            System.out.print("Enter element "+(i+1)+" of Array: ");
            A[i]=input.nextInt();
        }

        System.out.println("Max of array: "+maxOfArray(A));
        System.out.println("Min of array: "+minOfArray(A));
    }
    static int maxOfArray(int A[]){
        int max = Integer.MIN_VALUE;
        for (int i=0; i<A.length; i++) {
            if (A[i] > max)
                max = A[i];
        }
        return max;
    }
    static int minOfArray(int A[]){
        int min = Integer.MAX_VALUE;
        for (int i=0; i<A.length; i++){
            if (A[i]<min)
                min=A[i];

        }
        return min;
    }
}
