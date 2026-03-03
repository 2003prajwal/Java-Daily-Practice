class ExceptionHandling {
    public static void main(String[] args) {

        try {
            int a = 4;
            int b = 0;
            int c = a/b;
            System.out.println("Division: "+c);
        }
        catch (ArithmeticException e){
            System.out.println("Denominator should  not be 0, try again");
            System.out.println("Bye");
        }
    }
}
