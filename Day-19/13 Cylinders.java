class Cylinderss {
    private double radius;
    private double height;

    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        if (r>0)
         radius = r;
        else
            radius = 0;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double h){
        if (h>0)
         height = h;
        else
            height = 0;
    }

    public Cylinderss(){
        radius=height=1;
    }
    public Cylinderss(int r, int h){
        radius=r;
        height=h;
    }

}
class Cylinders{
    public static void main(String[] args) {

    }
}