class Circle{
    public double radius;

    public double area(){
        return Math.PI*radius*radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}
class ClassOfCircle {
    public static void main(String[] args){
         Circle C1 = new Circle();
         C1.radius=7;

         Circle C2 = new Circle();
         C2.radius=12;

        System.out.println("Area: "+C1.area());
        System.out.println("Perimeter: "+C1.perimeter());
        System.out.println("Circumference: "+C1.circumference());

        System.out.println();

        System.out.println("Area: "+C2.area());
        System.out.println("Perimeter: "+C2.perimeter());
        System.out.println("Circumference: "+C2.circumference());
    }

}