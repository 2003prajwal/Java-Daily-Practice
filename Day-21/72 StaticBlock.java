class tst{
    static int x = 10;
    int y = 20;

    void show(){
        System.out.println(x+" "+y);
    }

    static void display(){
        System.out.println(x);
    }
}
class StaticBlock {
    public static void main(String[] args) {
        tst t = new tst();
        t.show();
        t.x=30;
        t.y = 50;

        System.out.println();
        tst t1 = new tst();
        t1.show();

        System.out.println();
        tst.display();
    }
}
