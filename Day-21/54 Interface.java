interface test{
    void meth1();
    void meth2();
}
class  my implements test{
    public void meth1(){
        System.out.println("Meth 1 of my class");
    }
    public void meth2(){
        System.out.println("Meth 2 of my class");
    }
    public void meth3(){
        System.out.println("Meth 3 of my class");
    }
}
class Interface {
    public static void main(String[] args) {
        test T = new my();
        T.meth1();
        T.meth2();

        System.out.println();
        my t = new my();
        t.meth1();
        t.meth2();
        t.meth3();
    }
}
