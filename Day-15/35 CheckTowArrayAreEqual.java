import java.util.Scanner;

class CheckTowArrayAreEqual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int A []=new int [size];
        for (int i=0; i<A.length; i++){
            System.out.print("Enter Array Element "+(i+1)+": ");
            A[i]= input.nextInt();

        }

        System.out.println();

        System.out.print("Enter 2nd Array Size: ");
        int size2= input.nextInt();
        int B[]=new int[size2];

        for (int i=0; i<B.length; i++){
            System.out.print("Enter Array Element "+(i+1)+": ");
            B[i]= input.nextInt();
        }


        for (int i=0; i<A.length; i++){
            if (A[i]==B[i]){
                System.out.println("Array are equal");
                return;
            }

        }
        System.out.println("Array are not equal");
    }
}
