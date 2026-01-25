class LargestFromArray {
    public static void main(String[] args) {
        int number[]={1,3,5,2,6,4,7,10,2};
        largestFromArray(number);

    }
    public static void largestFromArray(int[] number){
        //Integer.MAX_VALUE; = -infinity & that under util package
        int largest = Integer.MIN_VALUE;
        for (int i=0; i< number.length; i++){
            if (largest<number[i]) {
                largest=number[i];
            }
        }
        System.out.println(largest);
    }
}

