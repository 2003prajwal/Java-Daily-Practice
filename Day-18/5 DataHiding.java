import java.util.Scanner;

class rectangle{
    private double length;
    private double breadth;

    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }

    public void setLength(double l){
        if (l>=0)
            length=l;
        else
            length=0;
    }

    public void setBreadth(double b){
        if (b>=0)
         breadth=b;
        else
            breadth=0;
    }

    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
}
class DataHiding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        rectangle r = new rectangle();

        System.out.print("Enter length: ");
        r.setLength(input.nextDouble());

        System.out.print("Enter Breadth: ");
        r.setBreadth(input.nextDouble());

        System.out.println("Area of rectangle: "+r.area());
        System.out.println("Perimeter of rectangle: "+r.perimeter());
    }
}
