 class NullsPointersExceptions {
    public static void main(String[] args) {
        int A[]=null;
        String name = null;
        try {
            System.out.println(A.length);
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
    }
}
