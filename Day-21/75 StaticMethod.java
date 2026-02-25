class StaticMethod {

    // Static Variable
    static int x = 100;
    // Instance Variable
    int y = 200;

    // 1️⃣ Basic Static Method
    static void show() {
        System.out.println("Basic Static Method");
        System.out.println("Access static variable x = " + x);
        System.out.println();
        // ❌ Cannot access instance variable directly
        // System.out.println(y);  // ERROR
    }

    // 2️⃣ Overloaded Static Method
    static void show(int a) {
        System.out.println("Overloaded Static Method with value: " + a);
        System.out.println();
    }


    // 3️⃣ Static Method Accessing Instance Variable using Object
    static void accessInstance() {
        StaticMethod obj = new StaticMethod();
        System.out.println("Access instance variable using object: " + obj.y);
        System.out.println();
    }

    // 4️⃣ Private Static Method
    private static void privateMethod() {
        System.out.println("Private Static Method");
        System.out.println();
    }

    // 5️⃣ Final Static Method
    final static void finalMethod() {
        System.out.println("Final Static Method");
        System.out.println();
    }

    // 6️⃣ Instance Method Calling Static Method
    void instanceMethod() {
        System.out.println("Instance Method Calling Static:");
        show();
        System.out.println();
    }

    public static void main(String[] args) {

        // ✔ Call using Class Name (Recommended)
        StaticMethod.show();

        // ✔ Direct Call (Same Class)
        show(50);

        // ✔ Call using Object (Allowed but not recommended)
        StaticMethod obj = new StaticMethod();
        obj.show();

        // ✔ Static method accessing instance data
        accessInstance();

        // ✔ Instance method calling static
        obj.instanceMethod();

        // ✔ Calling private static method
        privateMethod();

        // ✔ Calling final static method
        finalMethod();
    }
}