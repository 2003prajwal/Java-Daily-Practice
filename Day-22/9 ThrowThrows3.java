class ThrowThrows3 {
    static int meth1(){
        try {
            return 10 / 0;
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        return 0;
    }

    static void meth2(){
        meth1();
    }
    static void meth3(){
            meth2();
    }
    public static void main(String[] args) {
        meth3();
    }
}

