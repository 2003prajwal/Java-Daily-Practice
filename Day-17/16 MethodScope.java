class MethodScope {
    public static void main(String[] args) {
        show();
        // System.out.println(x); ❌ Error: x not accessible here
    }
        static void show() {
          //  System.out.println(x);  this sout show error because it not down side of variable
            int x = 10;   // method scope variable
            System.out.println(x);
        }

    }


