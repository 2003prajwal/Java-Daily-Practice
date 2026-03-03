class MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            int A[]={3,5,0,6,8,3};
            int r;
            r= A[0]/A[2];
            System.out.println(A[10]);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException s){
            System.out.println(s);
        }
        System.out.println("For a single exception occurrence, only one matching catch block executes.");
    }
}
