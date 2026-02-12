class CalculatorPromotion {
    public static void main(String[] args) {
        int x=3;
        double y = 6.3;
        calculator(x,y);

    }
    static void calculator(int x, int y){
        System.out.print("int method called");
        System.out.print("Result: "+(x+y));
    }

//this method also call if last method was not present
    static void calculator(double x, double y) {
        System.out.print("int method called");
        System.out.print("Result: " + (x + y));
    }

    static void calculator(int x, double y) {
        System.out.print("int method called");
        System.out.print("Result: " + (x + y));
    }
}
