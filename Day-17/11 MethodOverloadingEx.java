import java.util.Scanner;

class MethodOverloadingEx {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.print("Enter length of square: ");
        int length = input.nextInt();

        System.out.print("Enter breadth of square: ");
        int breadth = input.nextInt();
        System.out.println("Area of square is: "+area(length,breadth));

        System.out.println();
        System.out.print("Enter radius of circle: " );
        float radius = input.nextInt();
        System.out.println("Area of circle is: "+area(radius));

    }
    public static int area(int length, int breadth){
        return length*breadth;
    }
    public static float area(float radius){
        return(float) Math.PI*radius*radius;
    }
}
