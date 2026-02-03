class CountPositiveNegativeZero {
    public static void main(String[] args) {
        int A[]={1,2,-1,30,42,4,0,4,0,-5};

        int positive =0;
        int negative =0;
        int zero =0;
        for (int i=0; i<A.length; i++){
            if (A[i]>0){
                positive++;
            } else if (A[i]==0) {
                zero++;
            }else
                negative++;
        }
        System.out.println("Positive element in array:"+positive);
        System.out.println("Negative element in array: "+negative);
        System.out.println("Zero element in array: "+zero);
    }
}
