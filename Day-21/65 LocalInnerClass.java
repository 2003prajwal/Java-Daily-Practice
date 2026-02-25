class out{

    void Display(){
        class Inner{
            void innerDisplay(){
                System.out.println("Hello");
            }
        }
        Inner i = new Inner();
        i.innerDisplay();
    }
}
class LocalInnerClass {
    public static void main(String[] args) {
        out o = new out();
        o.Display();
    }
}
