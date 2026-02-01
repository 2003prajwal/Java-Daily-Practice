class CopyingAnArray {
    public static void main(String[] args) {
      int A[]= {1,2,4,6,43,5,3};
      int B[]= new int[7];

      for (int i=0; i<A.length; i++){
          B[i]=A[i];
          System.out.print(A[i]+" ");
      }
        System.out.println();
      for (int i=0; i< A.length; i++){
          System.out.print(B[i]+" ");
      }

    }
}
