class PairsInAnArray {
    public static void main(String[] args) {
        int A[]={2,4,6,8,10};
        int TotalPairs=0;
        for (int i=0; i<A.length; i++){
            for (int j=i+1; j<A.length; j++){
                System.out.print("("+A[i]+","+A[j]+") ");
                TotalPairs++;
            }
            System.out.println();

        }
        System.out.println("Total Pairs: "+TotalPairs);
    }
}
