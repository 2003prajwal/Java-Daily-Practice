class SecondMax {
    public static void main(String[] args) {
        int[] A = {1, 5, 7, 4, 75, 9, 67, 99, 86};
        int Max1,Max2;
        Max1=Max2=Integer.MIN_VALUE;
        for (int i=0; i<A.length; i++){
            if (Max1<A[i]){
                Max2=Max1;
                Max1=A[i];
            }
            else if (Max2<A[i]) {
                if (Max2<A[i]){
                    Max2=A[i];
                }

            }
        }

        System.out.println("Second Largest Element:"+Max2);
    }
}
