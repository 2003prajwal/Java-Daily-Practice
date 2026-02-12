class Method2 {
    //without static method call the main method is possible given below
    public static void main(String[] args) {
        int a = 10, b = 15;
        Method2 Sec = new Method2();
        System.out.println(Sec.max(a,b));
    }
    int max(int x , int y){
        if(x > y)
            return x;
        else
            return y;
    }
}
