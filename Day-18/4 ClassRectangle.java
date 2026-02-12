class Rectangles{
    double length;
    double breadth;

    public double area(){
        return length*breadth;
    }

    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isEqual(){
        return length==breadth;
    }

}

class ClassRectangle {
    public static void main(String[] args) {
        Rectangles R= new Rectangles();
        R.breadth=3;
        R.length=3;

        System.out.println(R.area());
        System.out.println(R.perimeter());
        System.out.println(R.isEqual());

    }
}
