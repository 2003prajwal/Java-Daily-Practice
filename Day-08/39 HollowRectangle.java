import java.util.Scanner;

class HollowRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Row Size: ");
        int totalRow = input.nextInt();
        System.out.print("Enter Column Size: ");
        int totalColumn = input.nextInt();
        Hollow_Rectangle(totalRow,totalColumn);
    }
    public static void Hollow_Rectangle(int totalRow, int totalColumn){
        for (int i=1; i<=totalRow; i++){
            for (int j=1; j<=totalColumn; j++){
                if (i==1 || i==totalColumn || j==1 || j==totalColumn){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
