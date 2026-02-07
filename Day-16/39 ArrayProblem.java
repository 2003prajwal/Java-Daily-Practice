class ArrayProblem {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,7,8,9,10};
        System.out.print("Add 10 to even indexed element: ");
        for (int i=0; i<A.length; i++){
            if(i%2==0){
                System.out.print(A[i]+10+" ");
            }
        }
        System.out.println();
        System.out.print("Multiply odd indexed element by 2: ");
        for (int i=0; i< A.length; i++){
            if (i%2!=0){
                System.out.print(A[i]*2+" ");
            }
        }
    }
}
