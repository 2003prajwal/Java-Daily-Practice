import java.util.Scanner;

class ArrayEX {
    public static void main(String[] args) {
        System.out.println("Welcome to array\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size = input.nextInt();
        int [] Array = new int[size];
        int i = 0;
        while (i < Array.length) {
            System.out.print("Enter element of array " + (i + 1) + ": ");
            Array[i] = input.nextInt();
            i++;
        }
        System.out.println("Array element: ");
        for (int j=0; j<size; j++) {
            System.out.print(Array[j] + " ");
        }
   }
}
