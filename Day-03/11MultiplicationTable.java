import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter NO:");
        int NO = input.nextInt();
        int i = 1;
        while (i<=10){
            System.out.println(NO+"x"+i+"= "+(NO*i));
            i++;
        }
    }
}
