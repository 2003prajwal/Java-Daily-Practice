class gt{
    static {
        System.out.println("Block 1");
    }

    static {
        System.out.println("Block 2");
    }
}
class StaticBlock3 {
    public static void main(String[] args) {
        System.out.println("Main");
        gt g = new gt();

    }
}
