class SumOfArray {
    public static void main(String[] args) {
        int[]Array = {1,4,2,5,7,4,3,6};
        int sum = 0;
        for (int i=0; i< Array.length; i++){
            sum = sum+Array[i];
        }
        System.out.print("Sum Of Array: "+sum);
    }
}