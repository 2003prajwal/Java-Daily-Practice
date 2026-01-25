import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter number that you want to search: ");
        int key = input.nextInt();
        int [] number = {1,3,2,4,5,6,7,8};
        linearSearch(number,key);
    }
    public static void linearSearch(int[] number, int key){
        for (int i=0; i<number.length; i++){
            if (number[i]==key){
                System.out.println("Number found at: "+i);
               return;
            }
        }
        System.out.println("Number not found!");
    }
}
