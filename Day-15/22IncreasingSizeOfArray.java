import java.util.Scanner;
class IncreasingSizeOfArray {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int A[]={1,2,3,4,5,6,7,8,9};
    int B[]=new int[15];

        for (int i=0; i<A.length; i++){
        System.out.print(A[i]+" ");
    }
        System.out.println();
        for (int i=0; i<A.length; i++){
        B[i]=A[i];
      //  System.out.print(B[i]+" ");
    }
        System.out.println();
        System.out.print("Enter index no here for add element on that index: ");
    int index = input.nextInt();

        if (index>B.length || index<0){
        System.out.println("Invalid Index!");
        return;
    }

        System.out.print("Enter number here that you want to insert in array at index "+index+": ");
    int num = input.nextInt();

        for (int i=B.length-1; i>index; i--){
        B[i]=B[i-1];
    }
    B[index]=num;
        for (int i=0; i<B.length; i++){
        System.out.print(B[i]+" ");
    }
}
}