import java.util.Scanner;

class ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Index: ");
        int index = input.nextInt();
        int A[] = {1,2,4,6,8,9,7};
        try {
            System.out.println(A[index]);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
