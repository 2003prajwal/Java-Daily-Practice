class testt{
    static int x = 10; //static variable
    int y = 20; // instance (non static) variable

    void show(){
        System.out.println(x);
        System.out.println(y);
    }
    static void display(){
        System.out.println(x);
        // System.out.println(y); not allow not static variable in static method
    }
}
class StaticVariable {
    public static void main(String[] args) {
        testt t = new testt();
        t.y=50;
        t.show();  //Print 10 and 50;
        t.x=30;   // modifies the static variable x

        System.out.println();
        testt t2 = new testt();
        t2.show();

        System.out.println();
        testt t3= new testt();
        t3.show();

        System.out.println();
        testt t4 = new testt();
        t4.y=45;
        t4.show();

        System.out.println();
        //Changing static variable x using class name
        testt.x = 100;
        t.show();    // //Here t y is print

        System.out.println();
        //Changing static variable x using class name
        testt.x = 40;
        t2.show(); //Here t2 y is print

        System.out.println();
        //Call Static method without object
        testt.display();

    }
}
