class Method4 {
    public static void main(String[] args) {
        int[] Array = {2,5,6,3,6,3,6};
        System.out.println(Array[0]);
        update(Array);
        System.out.println(Array[0]);
    }
    static void update(int[] Array){
        Array[0] = 5;
    }
}
