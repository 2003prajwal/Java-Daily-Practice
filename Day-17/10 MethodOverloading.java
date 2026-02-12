class MethodOverloading {
    public static void main(String[] args) {
        int a =2;
        int b = 3;
        int e= 4;
        float c = 1.0f;
        float d = 1.3f;

        System.out.println(max(a,b));
        System.out.println( max(c,d));
        System.out.println(max(a,b,e));

    }

    static int max(int a, int b){
        return a>b? a:b;
    }
    static float max(float c, float d){
        return c>d? c:d;
    }
    static int max(int a, int b, int e){
        if (a>b && a>e)
            return a;
        else if (b>a && b>e)
            return b;
        else
            return e;
    }
}
