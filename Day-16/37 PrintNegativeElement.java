class PrintNegativeElement {
    public static void main(String[] args) {
        int A[]={1,2,3,-3,-4,6,-6,-1};

        for (int i=0; i< A.length; i++){
            if (A[i]<0){
                System.out.println(A[i]);
            }
        }
    }
}
