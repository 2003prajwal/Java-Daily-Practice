import java.util.Scanner;
class OccurrancesArrayC2 {
    public static void main(String[] args) {
        System.out.println("Welcome to the Array Occurrences\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the size of array: ");
        int size = input.nextInt();
        int [] Array =new int[size];
        int i = 0;
        while (i < Array.length){
            System.out.print("Please enter the number "+ (i+1)+":");
            Array[i]=input.nextInt();
            i++;
        }
        System.out.print("Enter the number that you want to find:");
        int num = input.nextInt();
        int occurrences = NoOfOccurrences(Array,num);
        System.out.println("Your numbers was found "+occurrences+" times in the array");
    }
    public static int NoOfOccurrences(int[]Array,int num){
        int occ = 0;
        int i = 0;
        while (i < Array.length){
            if(Array[i]==num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
