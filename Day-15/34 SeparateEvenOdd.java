class SeparateEvenOdd {
    public static void main(String[] args) {
        int A[]={1,2,3,5,4,6,4,8,9,7};
        System.out.print("Even Number: ");
        for (int i=0; i<A.length; i++){
            if (A[i]%2==0){
                System.out.print(A[i]+" ");
            }
        }
        System.out.println();
        System.out.print("Odd Number: ");
        for (int i=0; i<A.length; i++){
            if (A[i]%2!=0) {
                System.out.print(A[i]+" ");
            }
        }
    }
}
