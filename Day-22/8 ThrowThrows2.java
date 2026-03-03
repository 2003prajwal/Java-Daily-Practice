class ThrowThrows2 {
    static int meth1(){
        return 10/0;
    }

    static void meth2(){
        try {
            meth1();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    static void meth3(){
      meth2();
    }
    public static void main(String[] args) {
        meth3();
    }
}

