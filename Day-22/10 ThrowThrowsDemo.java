class ThrowThrowsDemo {
    static int area(int l, int b) throws Exception{
        if (l<0 || b<0)
            throw new Exception();
        return l * b;
    }
    static void meth1() throws Exception{
        int a = area(-3,5);
        System.out.println(a);
    }
    public static void main(String[] args) {
      try {
          meth1();
      }
      catch (Exception e){
          System.out.println(e);
      }
    }
}
