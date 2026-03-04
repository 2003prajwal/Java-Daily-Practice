class FinallyWithMethod {
    static void meth1()throws Exception{
        try {
            throw new Exception();
        }
        finally {
            System.out.println("finally Message");
        }
    }
    public static void main(String[] args) throws Exception{
        meth1();
    }
}
