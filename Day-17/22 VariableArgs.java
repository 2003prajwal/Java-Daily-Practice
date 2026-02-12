class VariableArgs {
    public static void main(String[] args) {
        System.out.println(max());
        System.out.println(max(20));
        System.out.println(max(30,4,44));
        System.out.println(max(0,-1,43));
    }
    static int max(int...A){
       if (A.length==0)
           return Integer.MIN_VALUE;

       int max=Integer.MIN_VALUE;
       for (int i=0; i< A.length; i++) {
           if (A[i] > max) {
               max = A[i];
           }
       }
       return max;
    }
}
