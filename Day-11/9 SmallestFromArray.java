class SmallestFromArray {
    public static void main(String[] args) {
        int number[]={3,3,5,2,5,0,1,7,3,9};
        SmallestNumberFromArray(number);

    }
    public static void SmallestNumberFromArray(int[] number){
        int Smallest = Integer.MAX_VALUE;
        for (int i=0; i< number.length; i++){
            if (Smallest > number[i] ){
                Smallest = number[i];

            }
        }
        System.out.println(Smallest);
    }
}
