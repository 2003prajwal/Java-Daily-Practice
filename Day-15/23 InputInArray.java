import java.util.Scanner;

class InputInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of Array: ");
        int size = input.nextInt();
        int A[]= new int[size];

        for (int i=0; i<size; i++){
            System.out.print("Enter array element: "+(i+1)+":");
            A[i]=input.nextInt();
        }
    }
}
