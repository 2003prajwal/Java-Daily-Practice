class A{
    void meth1(){
        System.out.println("Meth 1 from super");
    }
    void meth2(){
        System.out.println("Meth 2 from super");
    }
}
class B extends A{
    @Override
    void meth2(){
        System.out.println("Meth 2 form sub");
    }
}
class DynamicMethodDispatch {
    public static void main(String[] args) {

        A b = new B();
        b.meth1();
        b.meth2();
    }
}
