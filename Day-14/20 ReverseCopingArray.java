class ReverseCopingArray {
    public static void main(String args[]){
        int A[]={1,2,3,4,5};
        int B[]=new int[5];

        for (int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");

        }
        System.out.println();
        for (int i = A.length-1; i >=0; i--){
            B[i]=A[i];
            System.out.print(B[i]+" ");
        }
    }
}
