
class FinalKey {
    //In class Without Initialization it an error
    final float PII = 3.34f;

    final float A; // in block allow
    {
        A = 4;
    }

    static float B;
    {
        B = 4.3f;
    }

    //Constructor
    final int C;
    public FinalKey(){
        C=4;
    }

    public static void main(String[] args) {
        final int X = 10;
        final float PI;
        PI=3.14f;
        System.out.println(PI);
       // System.out.println(PII);  not Possible
    }
}
