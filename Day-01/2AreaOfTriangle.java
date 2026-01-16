import java.util.Scanner;
class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Height of Triangle: ");
        float height = input.nextFloat();
        System.out.print("Enter Base of Triangle: ");
        float base = input.nextFloat();
        System.out.println("Area of Triangle: "+(height*base)/2);
       input.close();
    }
}
