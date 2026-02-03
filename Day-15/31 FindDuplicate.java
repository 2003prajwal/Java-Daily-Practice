class FindDuplicate {
    public static void main(String[] args) {
        int A[]={1,2,4,5,2,6,7,8};
        for (int i=0; i<A.length; i++){
           for (int j=i+1; j<A.length; j++){
               if (A[i]==A[j]){
                   System.out.println("Duplicate in array!");
                   return;
               }
           }

        }
        System.out.println("No Duplicate in array!");
    }
}
