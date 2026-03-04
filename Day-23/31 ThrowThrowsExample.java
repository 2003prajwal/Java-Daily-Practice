class ThrowThrowsExample {
    public  void age() throws IllegalStateException{
        int age  = 12;
        if (age<18)
            throw new IllegalStateException("Age is not valid");
        else
            System.out.println("Age is valid");
    }
    public static void main(String[] args) {
       ThrowThrowsExample e = new ThrowThrowsExample();
       try {
           e.age();
       } catch (IllegalStateException ex) {
           System.out.println(ex);
       }
    }
}
