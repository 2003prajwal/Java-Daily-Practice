import java.util.Scanner;

class MinMaxOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int sizeOfArray= input.nextInt();

        if (sizeOfArray<=0){
            System.out.println("Array size must be greater than zero!");
            return;
        }

        int A[] = new int[sizeOfArray];

        for (int i=0; i<sizeOfArray; i++){
            System.out.print("Enter size array element "+(i+1)+":");
            A[i]= input.nextInt();
        }

        System.out.println();
        int isMaximum= isMax(A);
        System.out.println("Maximum Of Array: "+isMaximum);

        int isMinimum = isMin(A);
        System.out.println("Minimum Of Array: "+ isMinimum);

    }
   public static int isMax(int A[]){
        int Max = Integer.MIN_VALUE;
        for (int i=0; i<A.length; i++){
            if (Max<A[i]){
                Max=A[i];
            }
        }
       return Max;
   }

   public static int isMin(int A[]){
        int Min = Integer.MAX_VALUE;
        for (int i=0; i<A.length; i++){
            if (Min>A[i]){
                Min=A[i];
            }
        }
        return Min;
   }
}
