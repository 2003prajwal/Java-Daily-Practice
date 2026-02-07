class ProductOfArray {
    public static void main(String[] args) {
        int A[]={1,2,3,4};

        int product = 1;
        for (int i=0; i<A.length; i++){
            product=product*A[i];
        }
        System.out.println("Product of array is: "+product);
    }
}
