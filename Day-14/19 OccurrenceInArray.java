import java.util.Scanner;

class OccurrenceInArray {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int A[]={1,2,3,3,53,5,3,5,60,60};
        int occ = 0;
        System.out.print("Enter number: ");
        int num = input.nextInt();
        for (int i=0; i<A.length; i++){
            if (num==A[i])
                occ++;
        }
        System.out.println("Your number find in "+occ+" in array.");
    }
}

