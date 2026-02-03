import java.util.Scanner;

class FindIndexOfAnElement {
    public static void main(String[] args) {
        int A[]={10,20,30,40,50,60,70,80,100};
        System.out.print("Array element: ");
        for (int x:A){

            System.out.print(x+" ");
        }

        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("Element to find: ");
        int element = input.nextInt();

        for (int i=0; i<A.length; i++){
            if (A[i]==element){
                System.out.println("Index of element: "+i);
                break;
            }
        }

        }
    }

