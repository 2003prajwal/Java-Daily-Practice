class Cylinder{
    double radius=3.2;
    double height=7.1;

    public double area(){
        return 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
    public double totalSurfaceArea(){
        double ans =2*Math.PI*radius*(height+radius);
        return 2*Math.PI*radius*(height+radius);
    }
}
class ClassCylinder {
    public static void main(String[] args) {
        Cylinder C = new Cylinder();
        System.out.println(C.area());
        System.out.println(C.volume());
        System.out.println(C.totalSurfaceArea());
    }
}
