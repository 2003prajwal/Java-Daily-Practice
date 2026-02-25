class StaticClass{
    // 1️⃣ Outer Static Variable
    static int outerStatic = 100;

    // 2️⃣ Outer Instance Variable
    int outerInstance = 200;

    // 3️⃣ Static Nested Class
    static class Inner {

        // 4️⃣ Static Variable inside Nested Class
        static int innerStatic = 300;

        // 5️⃣ Instance Variable inside Nested Class
        int innerInstance = 400;

        // 6️⃣ Static Method inside Nested Class
        static void staticMethod() {
            System.out.println("Inner Static Method");
            System.out.println("Access outer static: " + outerStatic);
            System.out.println("Access inner static: " + innerStatic);

            // ❌ Cannot access outerInstance directly
            // System.out.println(outerInstance); // ERROR
        }

        // 7️⃣ Instance Method inside Nested Class
        void instanceMethod() {
            System.out.println("Inner Instance Method");
            System.out.println("Inner Instance: " + innerInstance);

            // Access outer instance using object
            StaticClass obj = new StaticClass();
            System.out.println("Access outer instance using object: " + obj.outerInstance);
        }
    }

    public static void main(String[] args) {

        // 8️⃣ Create object of static nested class (No outer object needed)
        StaticClass.Inner obj1 = new StaticClass.Inner();
        StaticClass.Inner obj2 = new StaticClass.Inner();

        // 9️⃣ Call static method of nested class
        StaticClass.Inner.staticMethod();

        System.out.println("-------------");

        // 🔟 Call instance method
        obj1.instanceMethod();

        System.out.println("-------------");

        // 1️⃣1️⃣ Modify inner static variable
        StaticClass.Inner.innerStatic = 999;

        // Both objects see same static value
        System.out.println("Inner Static from obj1: " + obj1.innerStatic);
        System.out.println("Inner Static from obj2: " + obj2.innerStatic);
    }
}