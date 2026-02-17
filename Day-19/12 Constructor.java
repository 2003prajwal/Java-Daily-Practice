class rectanglese {
    private double length;
    private double breadth;

    // Default constructor
    public rectanglese() {
        length = 1;
        breadth = 1;
    }

    // Parameterized constructor (length & breadth)
    public rectanglese(double l, double b){
        length = l;
        breadth = b;
    }

    // Single-parameter constructor → square
    public rectanglese(double s){
        length = breadth = s;
    }

    // Method to display dimensions
    public void display() {
        System.out.println("Length = " + length + ", Breadth = " + breadth);
    }
}

// Application class
 class ConstructorTest {
    public static void main(String[] args) {

        // 1️⃣ Default Constructor
        rectanglese r1 = new rectanglese();
        System.out.print("Default: ");
        r1.display();

        // 2️⃣ Parameterized constructor (length & breadth)
        rectanglese r2 = new rectanglese(3, 5);
        System.out.print("Rectangle: ");
        r2.display();

        // 3️⃣ Single-parameter constructor → square
        rectanglese r3 = new rectanglese(4);
        System.out.print("Square: ");
        r3.display();
    }
}
