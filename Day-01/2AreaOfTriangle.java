import java.util.Scanner;
class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Height: ");
        float h = input.nextFloat();
        System.out.print("Enter Base: ");
        float b = input.nextFloat();

        float AreaOfTriangle = (h*b)/2;
        System.out.println("Area Of Triangle: "+AreaOfTriangle);


    }
}
