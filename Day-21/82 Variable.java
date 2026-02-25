class instance{
    int x = 10;   // instance variable
    void display(){    // inside class outside method
        System.out.println(x);
    }
}

class local extends instance{
    void display(){
        super.display();
        int x = 100; //Local variable
        System.out.println(x); // variable declared inside a method, constructor, or block
    }                       // x cannot use outside display().
}

class SStaticVariable {
    static String College = "ABC";
}
class Variable {
    public static void main(String[] args) {
        instance i = new local();
        i.display();

        System.out.println(SStaticVariable.College);
    }
}
