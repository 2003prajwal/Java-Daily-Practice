class Method5 {
    public static void main(String[] args) {
        int[] Array ={1,3,4,6,7,8};
        change(Array,2,12);
        int i = 0;
        while (i < Array.length) {
            System.out.println(Array[i]);
            i++;
        }
        change2(Array,0,0);

    }
    static void change(int[] Array,int index,int value){
        Array[index] = value;
    }

    static void change2(int[] Array, int index, int value){
        Array[index] = value;
    }
}
