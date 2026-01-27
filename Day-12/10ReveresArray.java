import java.util.Scanner;

public class ReveresArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your array size:");
        int size = input.nextInt();
        int[] Array = new int[size];
        int i = 0;
        while (i < Array.length){
            System.out.print("Enter your array element "+(i+1)+":");
            Array[i] = input.nextInt();
            i++;
        }
        revers(Array);
    }
    public static void revers(int[] Array){
        for(int i= Array.length;i>= 1;i--){
            System.out.println(i);
        }
    }
}
