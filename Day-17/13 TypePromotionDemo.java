class TypePromotionDemo {
    public static void main(String[] args) {
        char ch = 'A';

        show(ch);
    }
    static void show(int a){
        System.out.print("int method called: "+a);

    }
    static void show(double a){
        System.out.print("double method called: "+a);
    }
}
