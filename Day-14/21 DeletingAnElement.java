import java.util.Scanner;
class DeletingAnElement {
    public static void main(String[] args) {
        int []A ={1,2,3,4,5,5,6};

        for (int x:A){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.print("Enter index number that you want delete number from that index: ");
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        int n= A.length;
        if (index<0 || index>=n){
            System.out.println("Invalid Index!");
            return;
        }
        System.out.println();
        for (int i=index+1; i<n; i++){
            A[i-1]=A[i];
        }
        n--;

        for (int i=0; i<n; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.println(A.length);

    }
}
