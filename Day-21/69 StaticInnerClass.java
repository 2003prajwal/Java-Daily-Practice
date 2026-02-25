class Outt{
    static int x = 10;
    int y = 30;

    void display(){
        System.out.println(y);
    }
    static class innner {
        void display(){
            System.out.println(x);
           // System.out.println(y); not possible because of y is not static
        }
    }

}
class StaticInnerClass {
    public static void main(String[] args) {
        Outt o = new Outt();
        o.display();


        Outt.innner i = new Outt.innner();
        i.display();
    }
}
