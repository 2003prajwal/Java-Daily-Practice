class Method1 {
    public static void main(String[] args) {
        int a =10;
        int b =12;

        int c = greater(a,b);// That a,b is argument actual parameters
        System.out.println("This is your greater number: "+c);
    }
    public static int greater(int a, int b){//that int a, int b is parameter or formal parameter
       if (a>b)
           return a;
       else
           return b;
    }
}
//Note:If main method is static so another method is required to be static