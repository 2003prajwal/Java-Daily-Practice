import java.util.Scanner;

abstract class shape{
    abstract public double perimeter();
    abstract public double area();
    public void display(){
        System.out.println("Display");
    }
}
class circlle extends shape{
    double radius;
    @Override
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public double area(){
        return Math.PI*radius*radius;
    }
}
class Recc extends shape{
    double length;
    double breadth;

    @Override
    public double perimeter(){
        return 2*(length+breadth);
    }
    @Override
    public double area(){
        return length*breadth;
    }
}
class Abstract2 {
    public static void main(String[] args) {
       circlle c = new circlle();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius: ");

        c.radius = input.nextDouble();
        System.out.println(c.area());
        System.out.println(c.perimeter());
        c.display();

        Recc r = new Recc();
        r.length = 32;
        r.breadth = 12;

        System.out.println();
        System.out.println("Perimeter");
        System.out.println(r.area());
        System.out.println(r.perimeter());
        r.display();

    }
}
