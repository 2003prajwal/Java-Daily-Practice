class RotatingArrayOnLeft {
    public static void main(String[] args) {
        int[]Array={2,5,3,7,3,8,0,1,9};
        for (int x:Array) {
            System.out.print(x + " ");
        }
        int temp = Array[0];

        for (int i=1; i< Array.length; i++){
            Array[i-1]=Array[i];
        }
        Array[Array.length-1]=temp;
        System.out.println();

        for (int x:Array) {
            System.out.print(x + " ");
        }
    }
}

