class Circlee{
    public double radius;

    public double area(){
        return Math.PI*radius*radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }

    public double Circumference(){
        return perimeter();
    }
}

class Cylinderr extends Circlee{

    public double height;
    public double volume(){
        return area()*height;
    }
}
class Inheritance {
    public static void main(String[] args) {
        Cylinderr C = new Cylinderr();
        C.radius = 3;
        C.height = 5;

        System.out.println("Volume: "+C.volume());
        System.out.println("Area: "+C.area());
    }
}
