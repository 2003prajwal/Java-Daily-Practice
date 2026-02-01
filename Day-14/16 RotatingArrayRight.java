class RotatingArrayRight {
    public static void main(String[] args) {
        int Array[]={1,4,6,4,8,5,8,0,7};

        for (int x:Array){
            System.out.print(x+" ");

        }
        int temp = Array[Array.length-1];
        for (int i=Array.length-1; i>0; i--){
         Array[i]=Array[i-1];
        }
        System.out.println();
        Array[0]=temp;
        for (int x:Array){
            System.out.print(x+" ");

        }
    }
}
