class TestStatic {

    // Static variable (class-level)
    static int x = 10;

    // Instance variable (object-level)
    int y = 20;

    void show() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println();
    }

    static void display() {
        System.out.println("Static Method -> x = " + x);
        System.out.println();
    }
}

class StaticDemo {
    public static void main(String[] args) {

        // ✅ 1️⃣ Change y before calling show()
        TestStatic t1 = new TestStatic();
        t1.y = 50;
        System.out.println("Case 1:");
        t1.show();

        // ✅ 2️⃣ Change x using Class Name before object creation
        TestStatic.x = 100;
        TestStatic t2 = new TestStatic();
        System.out.println("Case 2:");
        t2.show();

        // ✅ 3️⃣ Change x using Object (allowed but not recommended)
        t1.x = 200;
        System.out.println("Case 3:");
        t2.show();  // affects all objects

        // ✅ 4️⃣ Modify y in one object only
        t2.y = 99;
        System.out.println("Case 4:");
        t1.show();  // y still 50
        t2.show();  // y is 99

        // ✅ 5️⃣ Call static method without object
        System.out.println("Case 5:");
        TestStatic.display();

        // ✅ 6️⃣ Access static variable without object
        System.out.println("Case 6:");
        System.out.println("Direct access x = " + TestStatic.x);
        System.out.println();

        // ✅ 7️⃣ Create multiple objects without changing anything
        System.out.println("Case 7:");
        TestStatic t3 = new TestStatic();
        TestStatic t4 = new TestStatic();
        t3.show();
        t4.show();

        // ✅ 8️⃣ Demonstrate what happens if y were static (simulation)
        // (We cannot change y to static here, but imagine if it was static,
        // then changing one would affect all.)

        System.out.println("Case 8 (concept explanation):");
        System.out.println("If y was static, changing t1.y would affect all objects.");
        System.out.println();

        // ✅ 9️⃣ Reset static variable
        TestStatic.x = 0;
        System.out.println("Case 9:");
        t1.show();
        t2.show();
        t3.show();

    }
}