class Outer{
    int x = 10;

    class Inner{
        int y = 20;
        void innerDisplay(){
            System.out.println(x);
            System.out.println(y);
        }
    }

    void outerDisplay(){
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y);

        Outer o = new Outer();
        System.out.println(o.x);
    }
}

class InnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();
        System.out.println();

        Outer.Inner i = new Outer().new Inner();
        System.out.println(i.y);
    }
}
