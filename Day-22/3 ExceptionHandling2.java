class ExceptionHandling2 {
    public static void main(String[] args) {
      /*  int a = 4;
        int b = 0;
        int c = a/b;
        System.out.println(c);
    RUN TIME ERROR
       */
        int a = 4;
        int b = 0;
       try{
           int c = a/b;
           System.out.println(c);
       }
       catch (ArithmeticException e){
           System.out.println("Error"+e);
       }
    }
    }

