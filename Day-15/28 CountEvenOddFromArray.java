class CountEvenOddFromArray {
    public static void main(String[] args) {
        int A[]={1,2,3,4,6,7,48,5,8,4,10};
        int totalNoInArray = 0;
        for (int i=0; i<A.length; i++){
            totalNoInArray++;
        }
           int Even=0;
           int Odd=0;

        for (int i=0; i<A.length; i++){
            if (A[i]%2==0){
                Even++;
            }
            else
                Odd++;
        }
        System.out.print("Total number in array: "+totalNoInArray);
        System.out.println("Even number in array: "+Even);
        System.out.println("Odd number in array: "+Odd);
    }
}
