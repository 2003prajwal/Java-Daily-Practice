class NestedTryCatch {
    public static void main(String[] args) {
        try {
            int A[] = {3, 5, 0, 5, 3};
            try {
                int r = A[3] / A[2];
                System.out.println(r);
            }
            catch (ArithmeticException e) {
                System.out.println(e);
            }

            System.out.println(A[10]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
