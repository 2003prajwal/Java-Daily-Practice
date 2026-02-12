class BlockScope {
    public static void main(String[] args) {

       // System.out.println(a);   this is not possible because variable not declare up to that sout
         int a =5;  // method scope variable

        {
            int x = 10; // block scope variable
            System.out.println(x);

            System.out.println(a);
        }
        // System.out.println(x); this show error because its out of block

        System.out.println(a);
    }
}
